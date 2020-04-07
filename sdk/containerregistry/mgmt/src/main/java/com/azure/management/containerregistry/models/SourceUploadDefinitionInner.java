// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SourceUploadDefinition model.
 */
@Fluent
public final class SourceUploadDefinitionInner {
    /*
     * The URL where the client can upload the source.
     */
    @JsonProperty(value = "uploadUrl")
    private String uploadUrl;

    /*
     * The relative path to the source. This is used to submit the subsequent
     * queue build request.
     */
    @JsonProperty(value = "relativePath")
    private String relativePath;

    /**
     * Get the uploadUrl property: The URL where the client can upload the
     * source.
     * 
     * @return the uploadUrl value.
     */
    public String uploadUrl() {
        return this.uploadUrl;
    }

    /**
     * Set the uploadUrl property: The URL where the client can upload the
     * source.
     * 
     * @param uploadUrl the uploadUrl value to set.
     * @return the SourceUploadDefinitionInner object itself.
     */
    public SourceUploadDefinitionInner withUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }

    /**
     * Get the relativePath property: The relative path to the source. This is
     * used to submit the subsequent queue build request.
     * 
     * @return the relativePath value.
     */
    public String relativePath() {
        return this.relativePath;
    }

    /**
     * Set the relativePath property: The relative path to the source. This is
     * used to submit the subsequent queue build request.
     * 
     * @param relativePath the relativePath value to set.
     * @return the SourceUploadDefinitionInner object itself.
     */
    public SourceUploadDefinitionInner withRelativePath(String relativePath) {
        this.relativePath = relativePath;
        return this;
    }
}
