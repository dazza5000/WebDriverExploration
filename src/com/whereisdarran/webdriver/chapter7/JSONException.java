package com.whereisdarran.webdriver.chapter7;

/**
 * Created by daz on 1/27/16.
 */
public class JSONException extends RuntimeException {
    /** Serialization ID */
    private static final long serialVersionUID = 0;

    /**
     * Constructs a JSONException with an explanatory message.
     *
     * @param message
     *            Detail about the reason for the exception.
     */
    public JSONException(final String message) {
        super(message);
    }

    /**
     * Constructs a JSONException with an explanatory message and cause.
     *
     * @param message
     *            Detail about the reason for the exception.
     * @param cause
     *            The cause.
     */
    public JSONException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new JSONException with the specified cause.
     *
     * @param cause
     *            The cause.
     */
    public JSONException(final Throwable cause) {
        super(cause.getMessage(), cause);
    }

}