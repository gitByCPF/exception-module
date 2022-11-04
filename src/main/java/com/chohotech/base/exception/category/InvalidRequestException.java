package com.chohotech.base.exception.category;

import com.chohotech.base.exception.ExceptionBase;
import com.chohotech.base.exception.ExceptionEnum;

@SuppressWarnings("unused")
public class InvalidRequestException extends ExceptionBase {
    public InvalidRequestException() {
        super(ExceptionEnum.INVALID_REQUEST.getCode(), ExceptionEnum.INVALID_REQUEST.getMessage(), null, null);
    }

    public InvalidRequestException(String message) {
        super(ExceptionEnum.INVALID_REQUEST.getCode(), message, null, null);
    }

    public InvalidRequestException(String message, Throwable e) {
        super(ExceptionEnum.INVALID_REQUEST.getCode(), message, e, null);
    }

    public InvalidRequestException(String message, Throwable e, String log) {
        super(ExceptionEnum.INVALID_REQUEST.getCode(), message, e, log);
    }

    public InvalidRequestException(String code, String message, Throwable e, String log) {
        super(code, message, e, log);
    }
}
