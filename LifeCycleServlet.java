package com.xuxiangzhou.week3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LifeCycleServlet", value = "/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {
    //  1.tomact read web.xml file and find out all servlet class
    //  2.load servlet -when   first request for this servlet come in -from client
    //  3.call default constructor -add code
    public LifeCycleServlet(){
        System.out.println("I am 2021211001001021xuxiangzhou");
    }
    //  4.init() -add code

    @Override
    public void init() throws ServletException {
        System.out.println("I am in init()");
    }
    //  5.tomcat call service()-->doGet or doPost
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("I am in doGet ");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void destroy() {
        System.out.println("I am in destroy() ");
        super.destroy();
    }
}
