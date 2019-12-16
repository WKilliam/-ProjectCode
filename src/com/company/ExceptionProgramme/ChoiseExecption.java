package com.company.ExceptionProgramme;

public class ChoiseExecption extends Throwable {


    public ChoiseExecption() {
    }

    public ChoiseExecption(String message) {
        super(message);
    }

    public ChoiseExecption(String message, Throwable cause) {
        super(message, cause);
    }

    public ChoiseExecption(Throwable cause) {
        super(cause);
    }

    public ChoiseExecption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
