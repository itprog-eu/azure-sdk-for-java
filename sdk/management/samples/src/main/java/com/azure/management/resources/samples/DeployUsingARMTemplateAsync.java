// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.resources.samples;


import com.azure.core.http.policy.HttpLogOptions;
import com.azure.management.Azure;
import com.azure.management.resources.Deployment;
import com.azure.management.resources.DeploymentMode;
import com.azure.management.resources.fluentcore.arm.Region;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.io.ByteStreams;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * Azure Resource sample for deploying resources using an ARM template and
 * showing progress.
 */

public final class DeployUsingARMTemplateAsync {

    /**
     * Main function which runs the actual sample.
     *
     * @param azure instance of the azure client
     * @return true if sample runs successfully
     */
    public static boolean runSample(final Azure azure) {
        final String rgPrefix = azure.sdkContext().randomResourceName("rgJavaTest", 16);
        final String deploymentPrefix = azure.sdkContext().randomResourceName("javaTest", 16);
        final String sshKey = getSSHPublicKey();
        final int numDeployments = 3;

        try {
            // Use the Simple VM Template with SSH Key auth from GH quickstarts

            final String templateUri = "https://raw.githubusercontent.com/Azure/azure-quickstart-templates/master/101-vm-sshkey/azuredeploy.json";
            final String templateContentVersion = "1.0.0.0";

            // Template only needs an SSH Key parameter

            ObjectMapper mapper = new ObjectMapper();
            ObjectNode node = mapper.createObjectNode();

            node.set("adminPublicKey", mapper.createObjectNode().put("value", sshKey));
            node.set("projectName", mapper.createObjectNode().put("value", "fluenttest"));
            node.set("adminUsername", mapper.createObjectNode().put("value", "fluenttesting"));

            final String parameters = node.toString();

            System.out.println("Starting VM deployments...");

            // Store all deployments in a list
            final List<String> deploymentList = new ArrayList<>();
            final List<String> succeeded = new ArrayList<>();
            final CountDownLatch latch = new CountDownLatch(1);

            Flux.range(1, numDeployments)
                    .flatMap(integer -> {
                        try {
                            String params;
                            if (integer == numDeployments) {
                                params = "{\"adminPublicKey\":{\"value\":\"bad content\"}}"; // Invalid parameters as a negative path
                            } else {
                                params = parameters;
                            }
                            String deploymentName = deploymentPrefix + "-" + integer;
                            deploymentList.add(deploymentName);
                            return azure.deployments()
                                    .define(deploymentName)
                                    .withNewResourceGroup(rgPrefix + "-" + integer, Region.US_SOUTH_CENTRAL)
                                    .withTemplateLink(templateUri, templateContentVersion)
                                    .withParameters(params)
                                    .withMode(DeploymentMode.COMPLETE)
                                    .createAsync().last();
                        } catch (IOException e) {
                            return Flux.error(e);
                        }
                    })
                    .map(indexable -> (Deployment) indexable)
                    .doOnNext(deployment -> {
                        if (deployment != null) {
                            System.out.println("Deployment finished: " + deployment.name());
                            succeeded.add(deployment.name());
                        }
                    })
                    .onErrorResume(e -> Mono.empty())
                    .doOnComplete(() -> latch.countDown())
                    .subscribe();

            latch.await();

            // Summary

            List<String> failed = new ArrayList<>();
            for (String deployment : deploymentList) {
                if (!succeeded.contains(deployment)) {
                    failed.add(deployment);
                }
            }
            System.out.println(String.format("Deployments %s succeeded. %s failed.",
                    String.join(", ", succeeded), String.join(", ", failed)));

            return true;
        } catch (Exception f) {

            System.out.println(f.getMessage());
            f.printStackTrace();

        } finally {
            try {
                for (int i = 1; i != numDeployments; i++) {
                    String rgName = rgPrefix + "-" + i;
                    System.out.println("Deleting Resource Group: " + rgName);
                    azure.resourceGroups().beginDeleteByName(rgName);
                    System.out.println("Deleted Resource Group: " + rgName);
                }
            } catch (NullPointerException npe) {
                System.out.println("Did not create any resources in Azure. No clean up is necessary");
            } catch (Exception g) {
                g.printStackTrace();
            }

        }
        return false;
    }

    /**
     * Main entry point.
     *
     * @param args the parameters
     */
    public static void main(String[] args) {
        try {
            //=================================================================
            // Authenticate

            final File credFile = new File(System.getenv("AZURE_AUTH_LOCATION"));

            Azure azure = Azure.configure()
                    .withLogOptions(new HttpLogOptions())
                    .authenticate(credFile)
                    .withDefaultSubscription();

            runSample(azure);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    private static String getSSHPublicKey() {
        byte[] content;
        try {
            content = ByteStreams.toByteArray(DeployUsingARMTemplateAsync.class.getResourceAsStream("/rsa.pub"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new String(content);
    }

    private DeployUsingARMTemplateAsync() {

    }
}
