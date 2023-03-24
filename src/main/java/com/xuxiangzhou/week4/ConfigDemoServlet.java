package com.xuxiangzhou.week4;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet("/config")
public class ConfigDemoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = (ServletContext) this.getServletContext();
        String name=(String) servletContext.getInitParameter("name");
        response.getWriter().println("name:"+name);
        response.getWriter().print("StudentId:"+this.getServletContext().getInitParameter("StudentId"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
