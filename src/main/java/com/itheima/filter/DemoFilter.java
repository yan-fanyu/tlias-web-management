package com.itheima.filter;

import javax.servlet.*;
import java.io.IOException;

public class DemoFilter implements Filter {

    @Override   // 只执行一次
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override   // 拦截到请求之后调用，执行多次
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override   // 销毁操作，只执行一次
    public void destroy() {
        Filter.super.destroy();
    }
}
