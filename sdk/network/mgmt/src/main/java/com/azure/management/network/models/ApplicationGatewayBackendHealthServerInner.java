// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.network.ApplicationGatewayBackendHealthServerHealth;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ApplicationGatewayBackendHealthServer model. */
@Fluent
public final class ApplicationGatewayBackendHealthServerInner {
    /*
     * IP address or FQDN of backend server.
     */
    @JsonProperty(value = "address")
    private String address;

    /*
     * Reference of IP configuration of backend server.
     */
    @JsonProperty(value = "ipConfiguration")
    private NetworkInterfaceIPConfigurationInner ipConfiguration;

    /*
     * Health of backend server.
     */
    @JsonProperty(value = "health")
    private ApplicationGatewayBackendHealthServerHealth health;

    /*
     * Health Probe Log.
     */
    @JsonProperty(value = "healthProbeLog")
    private String healthProbeLog;

    /**
     * Get the address property: IP address or FQDN of backend server.
     *
     * @return the address value.
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the address property: IP address or FQDN of backend server.
     *
     * @param address the address value to set.
     * @return the ApplicationGatewayBackendHealthServerInner object itself.
     */
    public ApplicationGatewayBackendHealthServerInner withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get the ipConfiguration property: Reference of IP configuration of backend server.
     *
     * @return the ipConfiguration value.
     */
    public NetworkInterfaceIPConfigurationInner ipConfiguration() {
        return this.ipConfiguration;
    }

    /**
     * Set the ipConfiguration property: Reference of IP configuration of backend server.
     *
     * @param ipConfiguration the ipConfiguration value to set.
     * @return the ApplicationGatewayBackendHealthServerInner object itself.
     */
    public ApplicationGatewayBackendHealthServerInner withIpConfiguration(
        NetworkInterfaceIPConfigurationInner ipConfiguration) {
        this.ipConfiguration = ipConfiguration;
        return this;
    }

    /**
     * Get the health property: Health of backend server.
     *
     * @return the health value.
     */
    public ApplicationGatewayBackendHealthServerHealth health() {
        return this.health;
    }

    /**
     * Set the health property: Health of backend server.
     *
     * @param health the health value to set.
     * @return the ApplicationGatewayBackendHealthServerInner object itself.
     */
    public ApplicationGatewayBackendHealthServerInner withHealth(ApplicationGatewayBackendHealthServerHealth health) {
        this.health = health;
        return this;
    }

    /**
     * Get the healthProbeLog property: Health Probe Log.
     *
     * @return the healthProbeLog value.
     */
    public String healthProbeLog() {
        return this.healthProbeLog;
    }

    /**
     * Set the healthProbeLog property: Health Probe Log.
     *
     * @param healthProbeLog the healthProbeLog value to set.
     * @return the ApplicationGatewayBackendHealthServerInner object itself.
     */
    public ApplicationGatewayBackendHealthServerInner withHealthProbeLog(String healthProbeLog) {
        this.healthProbeLog = healthProbeLog;
        return this;
    }
}
