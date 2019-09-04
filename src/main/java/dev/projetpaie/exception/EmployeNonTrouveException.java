package dev.projetpaie.exception;

public class EmployeNonTrouveException extends Exception {

    /**
     * 
     */

    public EmployeNonTrouveException() {
    }

    /**
     * @param message
     */

    public EmployeNonTrouveException(String message) {
        super(message);
    }

    /**
     * @param cause
     */

    public EmployeNonTrouveException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */

    public EmployeNonTrouveException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */

    public EmployeNonTrouveException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}