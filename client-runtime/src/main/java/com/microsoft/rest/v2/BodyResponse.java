/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.rest.v2;

import java.util.Map;

/**
 * A response to a REST call with a strongly-typed body specified.
 *
 * @param <TBody> The deserialized type of the response body.
 */
public final class BodyResponse<TBody> extends RestResponse<Void, TBody> {
    /**
     * Creates a new BodyResponse object.
     *
     * @param statusCode the status code of the HTTP response
     * @param rawHeaders the raw headers of the HTTP response
     * @param body the deserialized body
     */
    public BodyResponse(int statusCode, Map<String, String> rawHeaders, TBody body) {
        super(statusCode, null, rawHeaders, body);
    }

    // Used for uniform reflective creation in RestProxy.
    @SuppressWarnings("unused")
    BodyResponse(int statusCode, Void headers, Map<String, String> rawHeaders, TBody body) {
        super(statusCode, headers, rawHeaders, body);
    }

    /**
     * @return the deserialized body of the HTTP response
     */
    public TBody body() {
        return super.body();
    }
}
