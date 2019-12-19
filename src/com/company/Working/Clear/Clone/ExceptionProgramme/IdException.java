package com.company.Working.Clear.Clone.ExceptionProgramme;

public class IdException extends Throwable {

    public IdException(String s) {
    }

    public IdException(String message, Throwable cause) {
        super(message, cause);
    }

    public IdException(Throwable cause) {
        super(cause);
    }

    public IdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public IdException() {
    }
}
