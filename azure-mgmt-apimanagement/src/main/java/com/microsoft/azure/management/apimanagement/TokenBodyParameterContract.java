/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OAuth acquire token request body parameter (www-url-form-encoded).
 */
public class TokenBodyParameterContract {
    /**
     * body parameter name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * body parameter value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the TokenBodyParameterContract object itself.
     */
    public TokenBodyParameterContract withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the TokenBodyParameterContract object itself.
     */
    public TokenBodyParameterContract withValue(String value) {
        this.value = value;
        return this;
    }

}
