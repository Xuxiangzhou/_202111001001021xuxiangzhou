package com.xuxiangzhou.week6;//package com.JieMengyao.week6.demo;
//
//import javax.servlet.*;
//import javax.servlet.annotation.*;
//import java.io.IOException;
//
//@WebFilter(filterName = "Filter",value = "/*")    //value表示要过滤的路径
//public class EncondingFilter implements javax.servlet.Filter {
//    public void destroy() {
//    }
//
//    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
////        System.out.println("-------------------");
//        req.setCharacterEncoding("UTF-8");
//        resp.setContentType("text/html;charset=utf-8"); //同时设置服务端的编码格式和客户端的响应文件类型及响应编码格式
//        chain.doFilter(req, resp);
//    }
//
//
//    public void init(FilterConfig config) throws ServletException {
//
//    }
//
//}
