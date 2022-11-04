package com.chohotech.base.exception.category;

import com.chohotech.base.exception.ExceptionBase;
import com.chohotech.base.exception.ExceptionEnum;

/**
 * @author cpf email: cpfprogrammer@163.com
 * {@code @date} 2022/8/25 下午4:44
 */
@SuppressWarnings("unused")
public class TooManyTimesException extends ExceptionBase {
    public TooManyTimesException() {
        super(ExceptionEnum.TOO_MANY_TIMES.getCode(), ExceptionEnum.TOO_MANY_TIMES.getMessage(), null, null);
    }

    public TooManyTimesException(String message) {
        super(ExceptionEnum.TOO_MANY_TIMES.getCode(), message, null, null);
    }

    public TooManyTimesException(String message, Throwable e) {
        super(ExceptionEnum.TOO_MANY_TIMES.getCode(), message, e, null);
    }

    public TooManyTimesException(String message, Throwable e, String log) {
        super(ExceptionEnum.TOO_MANY_TIMES.getCode(), message, e, log);
    }

    public TooManyTimesException(String code, String message, Throwable e, String log) {
        super(code, message, e, log);
    }
}
