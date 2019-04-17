package com.lxq.springboot.filter;


import javax.servlet.*;
import java.io.IOException;

public class HeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("He Filter 您已进入filter过滤器，您的请求正常，请继续遵循规则...");
        chain.doFilter(request,response);
    }
}
