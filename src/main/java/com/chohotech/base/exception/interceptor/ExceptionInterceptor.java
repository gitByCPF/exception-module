package com.chohotech.base.exception.interceptor;

import com.chohotech.base.exception.category.ForbiddenException;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author cpf email: cpfprogrammer@163.com
 * {@code @date} 2022/11/2 下午9:02
 */
@Component
public class ExceptionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(@NonNull HttpServletRequest request,
                             @NonNull HttpServletResponse response,
                             @NonNull Object handler) throws Exception {
        if (request.getRequestURI().contains("interceptor")){
            throw new ForbiddenException("interceptor exception");
        }
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
