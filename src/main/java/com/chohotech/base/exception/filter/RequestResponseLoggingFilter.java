package com.chohotech.base.exception.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
//@Order(2)
@Slf4j
public class RequestResponseLoggingFilter implements Filter {
    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        if (req.getRequestURI().contains("filter")) {
            throw new RuntimeException("filter exception");
        }
        chain.doFilter(request, response);
    }
}

