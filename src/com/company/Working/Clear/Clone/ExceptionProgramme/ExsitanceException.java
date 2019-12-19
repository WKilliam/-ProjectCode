package com.company.Working.Clear.Clone.ExceptionProgramme;

public class ExsitanceException extends Throwable {
    public ExsitanceException() {
    }

    public ExsitanceException(String message) {
        super(message);
    }

    public ExsitanceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExsitanceException(Throwable cause) {
        super(cause);
    }

    public ExsitanceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
