// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.keyvault;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The OperationDisplay model.
 */
@Fluent
public final class OperationDisplay {
    /*
     * Service provider: Microsoft Key Vault.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * Resource on which the operation is performed etc.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /*
     * Type of operation: get, read, delete, etc.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /*
     * Description of operation.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the provider property: Service provider: Microsoft Key Vault.
     * 
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: Service provider: Microsoft Key Vault.
     * 
     * @param provider the provider value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: Resource on which the operation is performed
     * etc.
     * 
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: Resource on which the operation is performed
     * etc.
     * 
     * @param resource the resource value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation property: Type of operation: get, read, delete, etc.
     * 
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: Type of operation: get, read, delete, etc.
     * 
     * @param operation the operation value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description property: Description of operation.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of operation.
     * 
     * @param description the description value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withDescription(String description) {
        this.description = description;
        return this;
    }
}
