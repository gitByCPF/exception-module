package com.chohotech.base.exception.filter;

import com.chohotech.base.exception.ExceptionBase;
import com.chohotech.base.exception.view.ExceptionResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

/**
 * @author cpf email: cpfprogrammer@163.com
 * {@code @date} 2022/11/2 下午7:05
 */
@SuppressWarnings("unused")
@Component
@Order(-1)
@Slf4j
public class ExceptionHandlerFilter extends OncePerRequestFilter {

    @Override
    public void doFilterInternal(@NonNull HttpServletRequest request,
                                 @NonNull HttpServletResponse response,
                                 @NonNull FilterChain filterChain) throws IOException {
        try {
            filterChain.doFilter(request, response);
        } catch (Exception e) {
            response.setStatus(HttpStatus.OK.value());
            response.setContentType("application/json");
            ObjectMapper objectMapper = new ObjectMapper();
            response.getWriter().write(objectMapper.writeValueAsString(rebuild(e)));
        }
    }

    /**
     * 自定义异常和系统异常的构建方式不同.
     */
    public ExceptionResponse rebuild(Exception e) {
        if (e.getCause() instanceof ExceptionBase) {
            ExceptionBase exceptionBase = (ExceptionBase) e.getCause();
            Optional.ofNullable(exceptionBase.getLog()).ifPresentOrElse(
                    log::info,
                    () -> log.warn(e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()))
            );
            return ExceptionResponse.builder()
                    .code(exceptionBase.getCode())
                    .message(exceptionBase.getMessage())
                    .data("")
                    .build();
        } else {
            log.warn(e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
            return ExceptionResponse.builder()
                    .code("400")
                    .message(e.getMessage())
                    .data("")
                    .build();
        }
    }
}