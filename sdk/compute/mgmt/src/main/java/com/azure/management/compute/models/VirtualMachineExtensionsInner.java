// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.management.compute.VirtualMachineExtensionUpdate;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * VirtualMachineExtensions.
 */
public final class VirtualMachineExtensionsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private VirtualMachineExtensionsService service;

    /**
     * The service client containing this operation class.
     */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachineExtensionsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualMachineExtensionsInner(ComputeManagementClientImpl client) {
        this.service = RestProxy.create(VirtualMachineExtensionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * ComputeManagementClientVirtualMachineExtensions to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementClientVirtualMachineExtensions")
    private interface VirtualMachineExtensionsService {
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmName") String vmName, @PathParam("vmExtensionName") String vmExtensionName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") VirtualMachineExtensionInner extensionParameters, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> update(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmName") String vmName, @PathParam("vmExtensionName") String vmExtensionName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") VirtualMachineExtensionUpdate extensionParameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmName") String vmName, @PathParam("vmExtensionName") String vmExtensionName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualMachineExtensionInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmName") String vmName, @PathParam("vmExtensionName") String vmExtensionName, @QueryParam("$expand") String expand, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualMachineExtensionsListResultInner>> list(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmName") String vmName, @QueryParam("$expand") String expand, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualMachineExtensionInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmName") String vmName, @PathParam("vmExtensionName") String vmExtensionName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") VirtualMachineExtensionInner extensionParameters, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualMachineExtensionInner>> beginUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmName") String vmName, @PathParam("vmExtensionName") String vmExtensionName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") VirtualMachineExtensionUpdate extensionParameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmName") String vmName, @PathParam("vmExtensionName") String vmExtensionName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);
    }

    /**
     * The operation to create or update the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @param extensionParameters Describes a Virtual Machine Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtensionInner extensionParameters) {
        final String apiVersion = "2019-03-01";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), extensionParameters, apiVersion);
    }

    /**
     * The operation to create or update the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @param extensionParameters Describes a Virtual Machine Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualMachineExtensionInner> createOrUpdateAsync(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtensionInner extensionParameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, vmName, vmExtensionName, extensionParameters);
        return client.<VirtualMachineExtensionInner, VirtualMachineExtensionInner>getLroResultAsync(response, client.getHttpPipeline(), VirtualMachineExtensionInner.class, VirtualMachineExtensionInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * The operation to create or update the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @param extensionParameters Describes a Virtual Machine Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualMachineExtensionInner createOrUpdate(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtensionInner extensionParameters) {
        return createOrUpdateAsync(resourceGroupName, vmName, vmExtensionName, extensionParameters).block();
    }

    /**
     * The operation to update the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @param extensionParameters Describes a Virtual Machine Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> updateWithResponseAsync(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtensionUpdate extensionParameters) {
        final String apiVersion = "2019-03-01";
        return service.update(this.client.getHost(), resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), extensionParameters, apiVersion);
    }

    /**
     * The operation to update the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @param extensionParameters Describes a Virtual Machine Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualMachineExtensionInner> updateAsync(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtensionUpdate extensionParameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = updateWithResponseAsync(resourceGroupName, vmName, vmExtensionName, extensionParameters);
        return client.<VirtualMachineExtensionInner, VirtualMachineExtensionInner>getLroResultAsync(response, client.getHttpPipeline(), VirtualMachineExtensionInner.class, VirtualMachineExtensionInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * The operation to update the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @param extensionParameters Describes a Virtual Machine Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualMachineExtensionInner update(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtensionUpdate extensionParameters) {
        return updateAsync(resourceGroupName, vmName, vmExtensionName, extensionParameters).block();
    }

    /**
     * The operation to delete the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String vmName, String vmExtensionName) {
        final String apiVersion = "2019-03-01";
        return service.delete(this.client.getHost(), resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * The operation to delete the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String vmName, String vmExtensionName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, vmName, vmExtensionName);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * The operation to delete the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String vmName, String vmExtensionName) {
        deleteAsync(resourceGroupName, vmName, vmExtensionName).block();
    }

    /**
     * The operation to get the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VirtualMachineExtensionInner>> getWithResponseAsync(String resourceGroupName, String vmName, String vmExtensionName, String expand) {
        final String apiVersion = "2019-03-01";
        return service.get(this.client.getHost(), resourceGroupName, vmName, vmExtensionName, expand, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * The operation to get the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualMachineExtensionInner> getAsync(String resourceGroupName, String vmName, String vmExtensionName, String expand) {
        return getWithResponseAsync(resourceGroupName, vmName, vmExtensionName, expand)
            .flatMap((SimpleResponse<VirtualMachineExtensionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * The operation to get the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualMachineExtensionInner> getAsync(String resourceGroupName, String vmName, String vmExtensionName) {
        final String expand = null;
        final String apiVersion = "2019-03-01";
        return getWithResponseAsync(resourceGroupName, vmName, vmExtensionName, expand)
            .flatMap((SimpleResponse<VirtualMachineExtensionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * The operation to get the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualMachineExtensionInner get(String resourceGroupName, String vmName, String vmExtensionName, String expand) {
        return getAsync(resourceGroupName, vmName, vmExtensionName, expand).block();
    }

    /**
     * The operation to get the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualMachineExtensionInner get(String resourceGroupName, String vmName, String vmExtensionName) {
        final String expand = null;
        final String apiVersion = "2019-03-01";
        return getAsync(resourceGroupName, vmName, vmExtensionName, expand).block();
    }

    /**
     * The operation to get all extensions of a Virtual Machine.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VirtualMachineExtensionsListResultInner>> listWithResponseAsync(String resourceGroupName, String vmName, String expand) {
        final String apiVersion = "2019-03-01";
        return service.list(this.client.getHost(), resourceGroupName, vmName, expand, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * The operation to get all extensions of a Virtual Machine.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualMachineExtensionsListResultInner> listAsync(String resourceGroupName, String vmName, String expand) {
        return listWithResponseAsync(resourceGroupName, vmName, expand)
            .flatMap((SimpleResponse<VirtualMachineExtensionsListResultInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * The operation to get all extensions of a Virtual Machine.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualMachineExtensionsListResultInner> listAsync(String resourceGroupName, String vmName) {
        final String expand = null;
        final String apiVersion = "2019-03-01";
        return listWithResponseAsync(resourceGroupName, vmName, expand)
            .flatMap((SimpleResponse<VirtualMachineExtensionsListResultInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * The operation to get all extensions of a Virtual Machine.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualMachineExtensionsListResultInner list(String resourceGroupName, String vmName, String expand) {
        return listAsync(resourceGroupName, vmName, expand).block();
    }

    /**
     * The operation to get all extensions of a Virtual Machine.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualMachineExtensionsListResultInner list(String resourceGroupName, String vmName) {
        final String expand = null;
        final String apiVersion = "2019-03-01";
        return listAsync(resourceGroupName, vmName, expand).block();
    }

    /**
     * The operation to create or update the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @param extensionParameters Describes a Virtual Machine Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VirtualMachineExtensionInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtensionInner extensionParameters) {
        final String apiVersion = "2019-03-01";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), extensionParameters, apiVersion);
    }

    /**
     * The operation to create or update the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @param extensionParameters Describes a Virtual Machine Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualMachineExtensionInner> beginCreateOrUpdateAsync(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtensionInner extensionParameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, vmName, vmExtensionName, extensionParameters)
            .flatMap((SimpleResponse<VirtualMachineExtensionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * The operation to create or update the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @param extensionParameters Describes a Virtual Machine Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualMachineExtensionInner beginCreateOrUpdate(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtensionInner extensionParameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, vmName, vmExtensionName, extensionParameters).block();
    }

    /**
     * The operation to update the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @param extensionParameters Describes a Virtual Machine Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VirtualMachineExtensionInner>> beginUpdateWithResponseAsync(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtensionUpdate extensionParameters) {
        final String apiVersion = "2019-03-01";
        return service.beginUpdate(this.client.getHost(), resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), extensionParameters, apiVersion);
    }

    /**
     * The operation to update the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @param extensionParameters Describes a Virtual Machine Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualMachineExtensionInner> beginUpdateAsync(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtensionUpdate extensionParameters) {
        return beginUpdateWithResponseAsync(resourceGroupName, vmName, vmExtensionName, extensionParameters)
            .flatMap((SimpleResponse<VirtualMachineExtensionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * The operation to update the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @param extensionParameters Describes a Virtual Machine Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualMachineExtensionInner beginUpdate(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtensionUpdate extensionParameters) {
        return beginUpdateAsync(resourceGroupName, vmName, vmExtensionName, extensionParameters).block();
    }

    /**
     * The operation to delete the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String vmName, String vmExtensionName) {
        final String apiVersion = "2019-03-01";
        return service.beginDelete(this.client.getHost(), resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * The operation to delete the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String vmName, String vmExtensionName) {
        return beginDeleteWithResponseAsync(resourceGroupName, vmName, vmExtensionName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * The operation to delete the extension.
     * 
     * @param resourceGroupName 
     * @param vmName 
     * @param vmExtensionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String vmName, String vmExtensionName) {
        beginDeleteAsync(resourceGroupName, vmName, vmExtensionName).block();
    }
}
