package com.chohotech.base.exception.controller;

import com.chohotech.base.exception.category.ForbiddenException;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cpf email: cpfprogrammer@163.com
 * {@code @date} 2022/11/2 下午7:48
 */
@RestController
public class ExceptionController {

    @GetMapping("/success")
    public String success() {
        return "success";
    }

    @SneakyThrows
    @GetMapping("/fail")
    public String fail() {
        throw new ForbiddenException();
    }

    @SneakyThrows
    @GetMapping("/interceptor/fail")
    public String interceptorFail() {
        return "success";
    }

    @SneakyThrows
    @GetMapping("/filter/fail")
    public String filterFail() {
        return "success";
    }
}
