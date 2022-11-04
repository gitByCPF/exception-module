package com.chohotech.base.exception;

import lombok.Getter;

@Getter
public enum ExceptionEnum {
    INVALID_AUTH("401", "unauthorized"),
    TOO_MANY_TIMES("429", "too many times"),
    FORBIDDEN_ERROR("403", "forbidden"),
    INVALID_REQUEST("400", "parse error");

    private final String code;
    private final String message;

    ExceptionEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
