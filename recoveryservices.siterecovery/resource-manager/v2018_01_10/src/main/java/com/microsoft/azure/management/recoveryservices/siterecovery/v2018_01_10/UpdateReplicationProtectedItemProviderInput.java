/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Update replication protected item provider specific input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("UpdateReplicationProtectedItemProviderInput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "A2A", value = A2AUpdateReplicationProtectedItemInput.class),
    @JsonSubTypes.Type(name = "HyperVReplicaAzure", value = HyperVReplicaAzureUpdateReplicationProtectedItemInput.class),
    @JsonSubTypes.Type(name = "InMageAzureV2", value = InMageAzureV2UpdateReplicationProtectedItemInput.class)
})
public class UpdateReplicationProtectedItemProviderInput {
}