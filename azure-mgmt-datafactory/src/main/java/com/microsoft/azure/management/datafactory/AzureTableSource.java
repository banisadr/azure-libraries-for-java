/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Azure Table source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureTableSource")
public class AzureTableSource extends CopySource {
    /**
     * Azure Table source query. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "azureTableSourceQuery")
    private Object azureTableSourceQuery;

    /**
     * Azure Table source ignore table not found. Type: boolean (or Expression
     * with resultType boolean).
     */
    @JsonProperty(value = "azureTableSourceIgnoreTableNotFound")
    private Object azureTableSourceIgnoreTableNotFound;

    /**
     * Get the azureTableSourceQuery value.
     *
     * @return the azureTableSourceQuery value
     */
    public Object azureTableSourceQuery() {
        return this.azureTableSourceQuery;
    }

    /**
     * Set the azureTableSourceQuery value.
     *
     * @param azureTableSourceQuery the azureTableSourceQuery value to set
     * @return the AzureTableSource object itself.
     */
    public AzureTableSource withAzureTableSourceQuery(Object azureTableSourceQuery) {
        this.azureTableSourceQuery = azureTableSourceQuery;
        return this;
    }

    /**
     * Get the azureTableSourceIgnoreTableNotFound value.
     *
     * @return the azureTableSourceIgnoreTableNotFound value
     */
    public Object azureTableSourceIgnoreTableNotFound() {
        return this.azureTableSourceIgnoreTableNotFound;
    }

    /**
     * Set the azureTableSourceIgnoreTableNotFound value.
     *
     * @param azureTableSourceIgnoreTableNotFound the azureTableSourceIgnoreTableNotFound value to set
     * @return the AzureTableSource object itself.
     */
    public AzureTableSource withAzureTableSourceIgnoreTableNotFound(Object azureTableSourceIgnoreTableNotFound) {
        this.azureTableSourceIgnoreTableNotFound = azureTableSourceIgnoreTableNotFound;
        return this;
    }

}
