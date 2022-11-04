package com.chohotech.base.exception.configuration;

import com.chohotech.base.exception.interceptor.ExceptionInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author cpf email: cpfprogrammer@163.com
 * {@code @date} 2022/11/2 下午9:07
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    private final ExceptionInterceptor exceptionInterceptor;

    @Autowired
    public WebConfig(ExceptionInterceptor exceptionInterceptor) {
        this.exceptionInterceptor = exceptionInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(exceptionInterceptor)
                .addPathPatterns("/**");
    }
}
