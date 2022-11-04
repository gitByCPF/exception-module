package com.chohotech.base.exception.category;

import com.chohotech.base.exception.ExceptionBase;
import com.chohotech.base.exception.ExceptionEnum;

/**
 * @author cpf email: cpfprogrammer@163.com
 * {@code @date} 2022/8/17 下午4:45
 */
@SuppressWarnings("unused")
public class InvalidAuthException extends ExceptionBase {
    public InvalidAuthException() {
        super(ExceptionEnum.INVALID_AUTH.getCode(), ExceptionEnum.INVALID_AUTH.getMessage(), null, null);
    }

    public InvalidAuthException(String message) {
        super(ExceptionEnum.INVALID_AUTH.getCode(), message, null, null);
    }

    public InvalidAuthException(String message, Throwable e) {
        super(ExceptionEnum.INVALID_AUTH.getCode(), message, e, null);
    }

    public InvalidAuthException(String message, Throwable e, String log) {
        super(ExceptionEnum.INVALID_AUTH.getCode(), message, e, log);
    }

    public InvalidAuthException(String code, String message, Throwable e, String log) {
        super(code, message, e, log);
    }
}
