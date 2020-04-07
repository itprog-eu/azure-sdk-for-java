/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ProductState.
 */
public enum ProductState {
    /** Enum value notPublished. */
    NOT_PUBLISHED("notPublished"),

    /** Enum value published. */
    PUBLISHED("published");

    /** The actual serialized value for a ProductState instance. */
    private String value;

    ProductState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ProductState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ProductState object, or null if unable to parse.
     */
    @JsonCreator
    public static ProductState fromString(String value) {
        ProductState[] items = ProductState.values();
        for (ProductState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
