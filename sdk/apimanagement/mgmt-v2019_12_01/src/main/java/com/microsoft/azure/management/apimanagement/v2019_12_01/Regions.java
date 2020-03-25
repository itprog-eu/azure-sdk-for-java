/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.RegionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Regions.
 */
public interface Regions extends HasInner<RegionsInner> {
    /**
     * Lists all azure regions in which the service exists.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RegionContract> listByServiceAsync(final String resourceGroupName, final String serviceName);

}
