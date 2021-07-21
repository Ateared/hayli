package com.web.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

/**
 * @Author: HayLi pwx520500
 * @Date: 2021/7/21 22:55
 */
@WebFilter(filterName = "myFirstFilter",
        displayName = "myFirstFilter",
        urlPatterns = {"/index/*"},
        initParams = @WebInitParam(
                name = "myFirstFilterInitParam",
                value = "com.web.filter.MyFirstFilter")
)
@Slf4j
public class MyFirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info(" firstFilter init: Register a config ： {}", filterConfig.getFilterName());
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}
