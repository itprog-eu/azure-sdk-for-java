// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The InstancePoolFamilyCapability model.
 */
@Fluent
public final class InstancePoolFamilyCapability {
    /*
     * Family name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * List of supported license types.
     */
    @JsonProperty(value = "supportedLicenseTypes", access = JsonProperty.Access.WRITE_ONLY)
    private List<LicenseTypeCapability> supportedLicenseTypes;

    /*
     * List of supported virtual cores values.
     */
    @JsonProperty(value = "supportedVcoresValues", access = JsonProperty.Access.WRITE_ONLY)
    private List<InstancePoolVcoresCapability> supportedVcoresValues;

    /*
     * The status of the capability.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /*
     * The reason for the capability not being available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Get the name property: Family name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the supportedLicenseTypes property: List of supported license types.
     * 
     * @return the supportedLicenseTypes value.
     */
    public List<LicenseTypeCapability> supportedLicenseTypes() {
        return this.supportedLicenseTypes;
    }

    /**
     * Get the supportedVcoresValues property: List of supported virtual cores
     * values.
     * 
     * @return the supportedVcoresValues value.
     */
    public List<InstancePoolVcoresCapability> supportedVcoresValues() {
        return this.supportedVcoresValues;
    }

    /**
     * Get the status property: The status of the capability.
     * 
     * @return the status value.
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the reason property: The reason for the capability not being
     * available.
     * 
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason for the capability not being
     * available.
     * 
     * @param reason the reason value to set.
     * @return the InstancePoolFamilyCapability object itself.
     */
    public InstancePoolFamilyCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }
}
