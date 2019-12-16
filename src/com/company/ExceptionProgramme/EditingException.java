package com.company.ExceptionProgramme;

public class EditingException extends Throwable {

    public EditingException() {
    }

    public EditingException(String message) {
        super(message);
    }

    public EditingException(String message, Throwable cause) {
        super(message, cause);
    }

    public EditingException(Throwable cause) {
        super(cause);
    }

    public EditingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
