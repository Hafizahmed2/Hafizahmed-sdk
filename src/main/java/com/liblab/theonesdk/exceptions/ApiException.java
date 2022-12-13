

package com.liblab.theonesdk.exceptions;

import io.apimatic.core.types.CoreApiException;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is the base class for all exceptions that represent an error response from the server.
 */
public class ApiException extends CoreApiException {
    //UID for serialization
    private static final long serialVersionUID = 1L;

    //private fields

    /**
     * Initialization constructor.
     * @param reason The reason for throwing exception
     */
    public ApiException(String reason) {
        super(reason);
    }

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public ApiException(String reason, Context context) {
        super(reason, context);
    }
}