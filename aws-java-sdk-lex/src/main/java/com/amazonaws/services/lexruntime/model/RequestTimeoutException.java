/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lexruntime.model;

import javax.annotation.Generated;

/**
 * <p>
 * The input speech is too long.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestTimeoutException extends com.amazonaws.services.lexruntime.model.AmazonLexRuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new RequestTimeoutException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public RequestTimeoutException(String message) {
        super(message);
    }

}
