// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The MetricListResult model. */
@Fluent
public final class MetricListResultInner {
    /*
     * The list of metrics for the database.
     */
    @JsonProperty(value = "value", required = true)
    private List<MetricInner> value;

    /**
     * Get the value property: The list of metrics for the database.
     *
     * @return the value value.
     */
    public List<MetricInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of metrics for the database.
     *
     * @param value the value value to set.
     * @return the MetricListResultInner object itself.
     */
    public MetricListResultInner withValue(List<MetricInner> value) {
        this.value = value;
        return this;
    }
}
