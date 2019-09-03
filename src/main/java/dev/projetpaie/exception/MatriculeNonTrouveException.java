package dev.projetpaie.exception;

public class MatriculeNonTrouveException extends Exception {

    /**
     * 
     */

    public MatriculeNonTrouveException() {
    }

    /**
     * @param message
     */

    public MatriculeNonTrouveException(String message) {
        super(message);
    }

    /**
     * @param cause
     */

    public MatriculeNonTrouveException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */

    public MatriculeNonTrouveException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */

    public MatriculeNonTrouveException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}