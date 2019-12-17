package com.company.Working.ExceptionProgramme;

public class RemoveException extends Throwable {
    public RemoveException() {
    }

    public RemoveException(String message) {
        super(message);
    }

    public RemoveException(String message, Throwable cause) {
        super(message, cause);
    }

    public RemoveException(Throwable cause) {
        super(cause);
    }

    public RemoveException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
