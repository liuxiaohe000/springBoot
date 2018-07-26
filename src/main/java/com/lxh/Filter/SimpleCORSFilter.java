package com.lxh.Filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by HASEE on 2018/7/25.
 */
public class SimpleCORSFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        HttpServletRequest  request = (HttpServletRequest) servletRequest;
        response.setHeader("Access-Control-Allow-Origin","*");//所有请求
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));//cookie共享用这个配置
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token");
        response.setHeader("Access-Control-Allow-Credentials", "true");//cookie 共享
        response.setHeader("XDomainRequestAllowed","1");
        filterChain.doFilter(servletRequest, servletResponse);


    }

    @Override
    public void destroy() {

    }
}
