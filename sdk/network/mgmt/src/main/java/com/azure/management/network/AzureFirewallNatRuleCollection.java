// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The AzureFirewallNatRuleCollection model.
 */
@JsonFlatten
@Fluent
public class AzureFirewallNatRuleCollection extends SubResource {
    /*
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Priority of the NAT rule collection resource.
     */
    @JsonProperty(value = "properties.priority")
    private Integer priority;

    /*
     * AzureFirewall NAT Rule Collection Action.
     */
    @JsonProperty(value = "properties.action")
    private AzureFirewallNatRCAction action;

    /*
     * Collection of rules used by a NAT rule collection.
     */
    @JsonProperty(value = "properties.rules")
    private List<AzureFirewallNatRule> rules;

    /*
     * The current provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * Get the name property: Gets name of the resource that is unique within a
     * resource group. This name can be used to access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets name of the resource that is unique within a
     * resource group. This name can be used to access the resource.
     * 
     * @param name the name value to set.
     * @return the AzureFirewallNatRuleCollection object itself.
     */
    public AzureFirewallNatRuleCollection withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: Gets a unique read-only string that changes
     * whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the priority property: Priority of the NAT rule collection resource.
     * 
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of the NAT rule collection resource.
     * 
     * @param priority the priority value to set.
     * @return the AzureFirewallNatRuleCollection object itself.
     */
    public AzureFirewallNatRuleCollection withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the action property: AzureFirewall NAT Rule Collection Action.
     * 
     * @return the action value.
     */
    public AzureFirewallNatRCAction action() {
        return this.action;
    }

    /**
     * Set the action property: AzureFirewall NAT Rule Collection Action.
     * 
     * @param action the action value to set.
     * @return the AzureFirewallNatRuleCollection object itself.
     */
    public AzureFirewallNatRuleCollection withAction(AzureFirewallNatRCAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the rules property: Collection of rules used by a NAT rule
     * collection.
     * 
     * @return the rules value.
     */
    public List<AzureFirewallNatRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: Collection of rules used by a NAT rule
     * collection.
     * 
     * @param rules the rules value to set.
     * @return the AzureFirewallNatRuleCollection object itself.
     */
    public AzureFirewallNatRuleCollection withRules(List<AzureFirewallNatRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get the provisioningState property: The current provisioning state.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The current provisioning state.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the AzureFirewallNatRuleCollection object itself.
     */
    public AzureFirewallNatRuleCollection withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }
}
