/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ApimIdentityType.
 */
public final class ApimIdentityType extends ExpandableStringEnum<ApimIdentityType> {
    /** Static value SystemAssigned for ApimIdentityType. */
    public static final ApimIdentityType SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /** Static value UserAssigned for ApimIdentityType. */
    public static final ApimIdentityType USER_ASSIGNED = fromString("UserAssigned");

    /** Static value SystemAssigned, UserAssigned for ApimIdentityType. */
    public static final ApimIdentityType SYSTEM_ASSIGNED_USER_ASSIGNED = fromString("SystemAssigned, UserAssigned");

    /** Static value None for ApimIdentityType. */
    public static final ApimIdentityType NONE = fromString("None");

    /**
     * Creates or finds a ApimIdentityType from its string representation.
     * @param name a name to look for
     * @return the corresponding ApimIdentityType
     */
    @JsonCreator
    public static ApimIdentityType fromString(String name) {
        return fromString(name, ApimIdentityType.class);
    }

    /**
     * @return known ApimIdentityType values
     */
    public static Collection<ApimIdentityType> values() {
        return values(ApimIdentityType.class);
    }
}
