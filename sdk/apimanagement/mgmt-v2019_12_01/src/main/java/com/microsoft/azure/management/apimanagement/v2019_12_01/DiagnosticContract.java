/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.DiagnosticContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.ApiManagementManager;

/**
 * Type representing DiagnosticContract.
 */
public interface DiagnosticContract extends HasInner<DiagnosticContractInner>, Indexable, Updatable<DiagnosticContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the alwaysLog value.
     */
    AlwaysLog alwaysLog();

    /**
     * @return the backend value.
     */
    PipelineDiagnosticSettings backend();

    /**
     * @return the frontend value.
     */
    PipelineDiagnosticSettings frontend();

    /**
     * @return the httpCorrelationProtocol value.
     */
    HttpCorrelationProtocol httpCorrelationProtocol();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the logClientIp value.
     */
    Boolean logClientIp();

    /**
     * @return the loggerId value.
     */
    String loggerId();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the sampling value.
     */
    SamplingSettings sampling();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the verbosity value.
     */
    Verbosity verbosity();

    /**
     * The entirety of the DiagnosticContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithResourceGroupName, DefinitionStages.WithServiceName, DefinitionStages.WithIfMatch, DefinitionStages.WithLoggerId, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DiagnosticContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DiagnosticContract definition.
         */
        interface Blank extends WithResourceGroupName {
        }

        /**
         * The stage of the diagnosticcontract definition allowing to specify ResourceGroupName.
         */
        interface WithResourceGroupName {
           /**
            * Specifies resourceGroupName.
            * @param resourceGroupName The name of the resource group
            * @return the next definition stage
            */
            WithServiceName withResourceGroupName(String resourceGroupName);
        }

        /**
         * The stage of the diagnosticcontract definition allowing to specify ServiceName.
         */
        interface WithServiceName {
           /**
            * Specifies serviceName.
            * @param serviceName The name of the API Management service
            * @return the next definition stage
            */
            WithIfMatch withServiceName(String serviceName);
        }

        /**
         * The stage of the diagnosticcontract definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
            * @return the next definition stage
            */
            WithLoggerId withIfMatch(String ifMatch);
        }

        /**
         * The stage of the diagnosticcontract definition allowing to specify LoggerId.
         */
        interface WithLoggerId {
           /**
            * Specifies loggerId.
            * @param loggerId Resource Id of a target logger
            * @return the next definition stage
            */
            WithCreate withLoggerId(String loggerId);
        }

        /**
         * The stage of the diagnosticcontract definition allowing to specify AlwaysLog.
         */
        interface WithAlwaysLog {
            /**
             * Specifies alwaysLog.
             * @param alwaysLog Specifies for what type of messages sampling settings should not apply. Possible values include: 'allErrors'
             * @return the next definition stage
             */
            WithCreate withAlwaysLog(AlwaysLog alwaysLog);
        }

        /**
         * The stage of the diagnosticcontract definition allowing to specify Backend.
         */
        interface WithBackend {
            /**
             * Specifies backend.
             * @param backend Diagnostic settings for incoming/outgoing HTTP messages to the Backend
             * @return the next definition stage
             */
            WithCreate withBackend(PipelineDiagnosticSettings backend);
        }

        /**
         * The stage of the diagnosticcontract definition allowing to specify Frontend.
         */
        interface WithFrontend {
            /**
             * Specifies frontend.
             * @param frontend Diagnostic settings for incoming/outgoing HTTP messages to the Gateway
             * @return the next definition stage
             */
            WithCreate withFrontend(PipelineDiagnosticSettings frontend);
        }

        /**
         * The stage of the diagnosticcontract definition allowing to specify HttpCorrelationProtocol.
         */
        interface WithHttpCorrelationProtocol {
            /**
             * Specifies httpCorrelationProtocol.
             * @param httpCorrelationProtocol Sets correlation protocol to use for Application Insights diagnostics. Possible values include: 'None', 'Legacy', 'W3C'
             * @return the next definition stage
             */
            WithCreate withHttpCorrelationProtocol(HttpCorrelationProtocol httpCorrelationProtocol);
        }

        /**
         * The stage of the diagnosticcontract definition allowing to specify LogClientIp.
         */
        interface WithLogClientIp {
            /**
             * Specifies logClientIp.
             * @param logClientIp Log the ClientIP. Default is false
             * @return the next definition stage
             */
            WithCreate withLogClientIp(Boolean logClientIp);
        }

        /**
         * The stage of the diagnosticcontract definition allowing to specify Sampling.
         */
        interface WithSampling {
            /**
             * Specifies sampling.
             * @param sampling Sampling settings for Diagnostic
             * @return the next definition stage
             */
            WithCreate withSampling(SamplingSettings sampling);
        }

        /**
         * The stage of the diagnosticcontract definition allowing to specify Verbosity.
         */
        interface WithVerbosity {
            /**
             * Specifies verbosity.
             * @param verbosity The verbosity level applied to traces emitted by trace policies. Possible values include: 'verbose', 'information', 'error'
             * @return the next definition stage
             */
            WithCreate withVerbosity(Verbosity verbosity);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DiagnosticContract>, DefinitionStages.WithAlwaysLog, DefinitionStages.WithBackend, DefinitionStages.WithFrontend, DefinitionStages.WithHttpCorrelationProtocol, DefinitionStages.WithLogClientIp, DefinitionStages.WithSampling, DefinitionStages.WithVerbosity {
        }
    }
    /**
     * The template for a DiagnosticContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DiagnosticContract>, UpdateStages.WithIfMatch, UpdateStages.WithAlwaysLog, UpdateStages.WithBackend, UpdateStages.WithFrontend, UpdateStages.WithHttpCorrelationProtocol, UpdateStages.WithLogClientIp, UpdateStages.WithSampling, UpdateStages.WithVerbosity {
    }

    /**
     * Grouping of DiagnosticContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the diagnosticcontract update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the diagnosticcontract update allowing to specify AlwaysLog.
         */
        interface WithAlwaysLog {
            /**
             * Specifies alwaysLog.
             * @param alwaysLog Specifies for what type of messages sampling settings should not apply. Possible values include: 'allErrors'
             * @return the next update stage
             */
            Update withAlwaysLog(AlwaysLog alwaysLog);
        }

        /**
         * The stage of the diagnosticcontract update allowing to specify Backend.
         */
        interface WithBackend {
            /**
             * Specifies backend.
             * @param backend Diagnostic settings for incoming/outgoing HTTP messages to the Backend
             * @return the next update stage
             */
            Update withBackend(PipelineDiagnosticSettings backend);
        }

        /**
         * The stage of the diagnosticcontract update allowing to specify Frontend.
         */
        interface WithFrontend {
            /**
             * Specifies frontend.
             * @param frontend Diagnostic settings for incoming/outgoing HTTP messages to the Gateway
             * @return the next update stage
             */
            Update withFrontend(PipelineDiagnosticSettings frontend);
        }

        /**
         * The stage of the diagnosticcontract update allowing to specify HttpCorrelationProtocol.
         */
        interface WithHttpCorrelationProtocol {
            /**
             * Specifies httpCorrelationProtocol.
             * @param httpCorrelationProtocol Sets correlation protocol to use for Application Insights diagnostics. Possible values include: 'None', 'Legacy', 'W3C'
             * @return the next update stage
             */
            Update withHttpCorrelationProtocol(HttpCorrelationProtocol httpCorrelationProtocol);
        }

        /**
         * The stage of the diagnosticcontract update allowing to specify LogClientIp.
         */
        interface WithLogClientIp {
            /**
             * Specifies logClientIp.
             * @param logClientIp Log the ClientIP. Default is false
             * @return the next update stage
             */
            Update withLogClientIp(Boolean logClientIp);
        }

        /**
         * The stage of the diagnosticcontract update allowing to specify Sampling.
         */
        interface WithSampling {
            /**
             * Specifies sampling.
             * @param sampling Sampling settings for Diagnostic
             * @return the next update stage
             */
            Update withSampling(SamplingSettings sampling);
        }

        /**
         * The stage of the diagnosticcontract update allowing to specify Verbosity.
         */
        interface WithVerbosity {
            /**
             * Specifies verbosity.
             * @param verbosity The verbosity level applied to traces emitted by trace policies. Possible values include: 'verbose', 'information', 'error'
             * @return the next update stage
             */
            Update withVerbosity(Verbosity verbosity);
        }

    }
}
