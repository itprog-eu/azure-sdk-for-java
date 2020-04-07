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
 * Defines values for BackendProtocol.
 */
public final class BackendProtocol extends ExpandableStringEnum<BackendProtocol> {
    /** Static value http for BackendProtocol. */
    public static final BackendProtocol HTTP = fromString("http");

    /** Static value soap for BackendProtocol. */
    public static final BackendProtocol SOAP = fromString("soap");

    /**
     * Creates or finds a BackendProtocol from its string representation.
     * @param name a name to look for
     * @return the corresponding BackendProtocol
     */
    @JsonCreator
    public static BackendProtocol fromString(String name) {
        return fromString(name, BackendProtocol.class);
    }

    /**
     * @return known BackendProtocol values
     */
    public static Collection<BackendProtocol> values() {
        return values(BackendProtocol.class);
    }
}
