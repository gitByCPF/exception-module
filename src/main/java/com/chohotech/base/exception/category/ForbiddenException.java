package com.chohotech.base.exception.category;

import com.chohotech.base.exception.ExceptionBase;
import com.chohotech.base.exception.ExceptionEnum;

/**
 * @author cpf email: cpfprogrammer@163.com
 * {@code @date} 2022/8/22 下午3:42
 */
@SuppressWarnings("unused")
public class ForbiddenException extends ExceptionBase {
    public ForbiddenException() {
        super(ExceptionEnum.FORBIDDEN_ERROR.getCode(), ExceptionEnum.FORBIDDEN_ERROR.getMessage(), null, null);
    }

    public ForbiddenException(String message) {
        super(ExceptionEnum.FORBIDDEN_ERROR.getCode(), message, null, null);
    }

    public ForbiddenException(String message, Throwable e) {
        super(ExceptionEnum.FORBIDDEN_ERROR.getCode(), message, e, null);
    }

    public ForbiddenException(String message, Throwable e, String log) {
        super(ExceptionEnum.FORBIDDEN_ERROR.getCode(), message, e, log);
    }

    public ForbiddenException(String code, String message, Throwable e, String log) {
        super(code, message, e, log);
    }
}
