package com.company.Working.ExceptionProgramme;

public class TextException extends Throwable {
    public TextException() {
    }

    public TextException(String message) {
        super(message);
    }

    public TextException(String message, Throwable cause) {
        super(message, cause);
    }

    public TextException(Throwable cause) {
        super(cause);
    }

    public TextException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
