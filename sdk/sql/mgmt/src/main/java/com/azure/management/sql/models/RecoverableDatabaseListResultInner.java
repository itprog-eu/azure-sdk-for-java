// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The RecoverableDatabaseListResult model.
 */
@Fluent
public final class RecoverableDatabaseListResultInner {
    /*
     * A list of recoverable databases
     */
    @JsonProperty(value = "value", required = true)
    private List<RecoverableDatabaseInner> value;

    /**
     * Get the value property: A list of recoverable databases.
     * 
     * @return the value value.
     */
    public List<RecoverableDatabaseInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of recoverable databases.
     * 
     * @param value the value value to set.
     * @return the RecoverableDatabaseListResultInner object itself.
     */
    public RecoverableDatabaseListResultInner withValue(List<RecoverableDatabaseInner> value) {
        this.value = value;
        return this;
    }
}
