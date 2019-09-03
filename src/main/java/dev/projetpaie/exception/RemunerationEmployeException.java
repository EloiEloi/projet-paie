package dev.projetpaie.exception;

public class RemunerationEmployeException extends Exception {

    /**
     * 
     */

    public RemunerationEmployeException() {
    }

    /**
     * @param message
     */

    public RemunerationEmployeException(String message) {
        super(message);
    }

    /**
     * @param cause
     */

    public RemunerationEmployeException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */

    public RemunerationEmployeException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */

    public RemunerationEmployeException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}