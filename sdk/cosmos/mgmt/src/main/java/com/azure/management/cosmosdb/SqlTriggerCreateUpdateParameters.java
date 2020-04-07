// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The SqlTriggerCreateUpdateParameters model.
 */
@JsonFlatten
@Fluent
public class SqlTriggerCreateUpdateParameters extends ARMResourceProperties {
    /*
     * The standard JSON format of a trigger
     */
    @JsonProperty(value = "properties.resource", required = true)
    private SqlTriggerResource resource;

    /*
     * A key-value pair of options to be applied for the request. This
     * corresponds to the headers sent with the request.
     */
    @JsonProperty(value = "properties.options", required = true)
    private Map<String, String> options;

    /**
     * Get the resource property: The standard JSON format of a trigger.
     * 
     * @return the resource value.
     */
    public SqlTriggerResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The standard JSON format of a trigger.
     * 
     * @param resource the resource value to set.
     * @return the SqlTriggerCreateUpdateParameters object itself.
     */
    public SqlTriggerCreateUpdateParameters withResource(SqlTriggerResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the options property: A key-value pair of options to be applied for
     * the request. This corresponds to the headers sent with the request.
     * 
     * @return the options value.
     */
    public Map<String, String> options() {
        return this.options;
    }

    /**
     * Set the options property: A key-value pair of options to be applied for
     * the request. This corresponds to the headers sent with the request.
     * 
     * @param options the options value to set.
     * @return the SqlTriggerCreateUpdateParameters object itself.
     */
    public SqlTriggerCreateUpdateParameters withOptions(Map<String, String> options) {
        this.options = options;
        return this;
    }
}
