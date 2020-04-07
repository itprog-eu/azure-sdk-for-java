// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ListUsagesResult model.
 */
@Fluent
public final class ListUsagesResultInner {
    /*
     * The list of compute resource usages.
     */
    @JsonProperty(value = "value", required = true)
    private List<UsageInner> value;

    /*
     * The URI to fetch the next page of compute resource usage information.
     * Call ListNext() with this to fetch the next page of compute resource
     * usage information.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of compute resource usages.
     * 
     * @return the value value.
     */
    public List<UsageInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of compute resource usages.
     * 
     * @param value the value value to set.
     * @return the ListUsagesResultInner object itself.
     */
    public ListUsagesResultInner withValue(List<UsageInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of compute
     * resource usage information. Call ListNext() with this to fetch the next
     * page of compute resource usage information.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of compute
     * resource usage information. Call ListNext() with this to fetch the next
     * page of compute resource usage information.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ListUsagesResultInner object itself.
     */
    public ListUsagesResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
