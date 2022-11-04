package com.chohotech.base.exception;

import lombok.Getter;

@SuppressWarnings("unused")
@Getter
public class ExceptionBase extends Exception {
    private String code;
    private String message;
    private Throwable e;
    private String log;

    public ExceptionBase() {
    }

    public ExceptionBase(String code, String message, Throwable e, String log) {
        this.message = message;
        this.code = code;
        this.log = log;
        this.e = e;
    }
}
