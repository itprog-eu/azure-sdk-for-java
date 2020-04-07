/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.ApiManagementManager;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.TenantConfigurationSyncStateContractInner;
import org.joda.time.DateTime;

/**
 * Type representing TenantConfigurationSyncStateContract.
 */
public interface TenantConfigurationSyncStateContract extends HasInner<TenantConfigurationSyncStateContractInner>, HasManager<ApiManagementManager> {
    /**
     * @return the branch value.
     */
    String branch();

    /**
     * @return the commitId value.
     */
    String commitId();

    /**
     * @return the configurationChangeDate value.
     */
    DateTime configurationChangeDate();

    /**
     * @return the isExport value.
     */
    Boolean isExport();

    /**
     * @return the isGitEnabled value.
     */
    Boolean isGitEnabled();

    /**
     * @return the isSynced value.
     */
    Boolean isSynced();

    /**
     * @return the syncDate value.
     */
    DateTime syncDate();

}
