// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The AzureFirewallNatRule model.
 */
@Fluent
public final class AzureFirewallNatRule {
    /*
     * Name of the NAT rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Description of the rule.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * List of source IP addresses for this rule.
     */
    @JsonProperty(value = "sourceAddresses")
    private List<String> sourceAddresses;

    /*
     * List of destination IP addresses for this rule. Supports IP ranges,
     * prefixes, and service tags.
     */
    @JsonProperty(value = "destinationAddresses")
    private List<String> destinationAddresses;

    /*
     * List of destination ports.
     */
    @JsonProperty(value = "destinationPorts")
    private List<String> destinationPorts;

    /*
     * Array of AzureFirewallNetworkRuleProtocols applicable to this NAT rule.
     */
    @JsonProperty(value = "protocols")
    private List<AzureFirewallNetworkRuleProtocol> protocols;

    /*
     * The translated address for this NAT rule.
     */
    @JsonProperty(value = "translatedAddress")
    private String translatedAddress;

    /*
     * The translated port for this NAT rule.
     */
    @JsonProperty(value = "translatedPort")
    private String translatedPort;

    /**
     * Get the name property: Name of the NAT rule.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the NAT rule.
     * 
     * @param name the name value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: Description of the rule.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the rule.
     * 
     * @param description the description value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the sourceAddresses property: List of source IP addresses for this
     * rule.
     * 
     * @return the sourceAddresses value.
     */
    public List<String> sourceAddresses() {
        return this.sourceAddresses;
    }

    /**
     * Set the sourceAddresses property: List of source IP addresses for this
     * rule.
     * 
     * @param sourceAddresses the sourceAddresses value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withSourceAddresses(List<String> sourceAddresses) {
        this.sourceAddresses = sourceAddresses;
        return this;
    }

    /**
     * Get the destinationAddresses property: List of destination IP addresses
     * for this rule. Supports IP ranges, prefixes, and service tags.
     * 
     * @return the destinationAddresses value.
     */
    public List<String> destinationAddresses() {
        return this.destinationAddresses;
    }

    /**
     * Set the destinationAddresses property: List of destination IP addresses
     * for this rule. Supports IP ranges, prefixes, and service tags.
     * 
     * @param destinationAddresses the destinationAddresses value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withDestinationAddresses(List<String> destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
        return this;
    }

    /**
     * Get the destinationPorts property: List of destination ports.
     * 
     * @return the destinationPorts value.
     */
    public List<String> destinationPorts() {
        return this.destinationPorts;
    }

    /**
     * Set the destinationPorts property: List of destination ports.
     * 
     * @param destinationPorts the destinationPorts value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withDestinationPorts(List<String> destinationPorts) {
        this.destinationPorts = destinationPorts;
        return this;
    }

    /**
     * Get the protocols property: Array of AzureFirewallNetworkRuleProtocols
     * applicable to this NAT rule.
     * 
     * @return the protocols value.
     */
    public List<AzureFirewallNetworkRuleProtocol> protocols() {
        return this.protocols;
    }

    /**
     * Set the protocols property: Array of AzureFirewallNetworkRuleProtocols
     * applicable to this NAT rule.
     * 
     * @param protocols the protocols value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withProtocols(List<AzureFirewallNetworkRuleProtocol> protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * Get the translatedAddress property: The translated address for this NAT
     * rule.
     * 
     * @return the translatedAddress value.
     */
    public String translatedAddress() {
        return this.translatedAddress;
    }

    /**
     * Set the translatedAddress property: The translated address for this NAT
     * rule.
     * 
     * @param translatedAddress the translatedAddress value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withTranslatedAddress(String translatedAddress) {
        this.translatedAddress = translatedAddress;
        return this;
    }

    /**
     * Get the translatedPort property: The translated port for this NAT rule.
     * 
     * @return the translatedPort value.
     */
    public String translatedPort() {
        return this.translatedPort;
    }

    /**
     * Set the translatedPort property: The translated port for this NAT rule.
     * 
     * @param translatedPort the translatedPort value to set.
     * @return the AzureFirewallNatRule object itself.
     */
    public AzureFirewallNatRule withTranslatedPort(String translatedPort) {
        this.translatedPort = translatedPort;
        return this;
    }
}
