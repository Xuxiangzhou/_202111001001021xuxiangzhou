package com.xuxiangzhou.week4;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemoServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        String driver="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://127.0.0.1:3306/stu";
        String username="root";
        String password="1234";

        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("-->"+connection);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
//  connection in doGet();
        System.out.println("I am in doget.");
        String method = request.getMethod();
        System.out.println(method);
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        String URI = request.getRequestURI();
        System.out.println(URI);
        StringBuffer URL = request.getRequestURL();
        System.out.println(URL.toString());


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取post请求体
        BufferedReader reader = request.getReader();
        String line = reader.readLine();
        System.out.println(line);
    }
}
