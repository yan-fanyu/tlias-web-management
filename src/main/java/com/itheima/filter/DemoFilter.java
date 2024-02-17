//package com.itheima.filter;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import java.io.IOException;
//
//
////@WebFilter(urlPatterns = "/*")
//public class DemoFilter implements Filter {
//
//    @Override   // 只执行一次
//    public void init(FilterConfig filterConfig) throws ServletException {
//        Filter.super.init(filterConfig);
//        System.out.println("初始化");
//    }
//
//    @Override   // 拦截到请求之后调用，执行多次
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        System.out.println("拦截");
//
//        // 放行
//        filterChain.doFilter(servletRequest, servletResponse);
//    }
//
//    @Override   // 销毁操作，只执行一次
//    public void destroy() {
//        Filter.super.destroy();
//        System.out.println("销毁了");
//    }
//}
