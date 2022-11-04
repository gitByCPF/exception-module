package com.chohotech.base.exception.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author cpf email: cpfprogrammer@163.com
 * {@code @date} 2022/11/2 下午5:16
 */
@Builder
@Setter
@Getter
public class ExceptionResponse {
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("Data")
    private Object data;
}
