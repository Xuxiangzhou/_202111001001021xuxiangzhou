package com.xuxiangzhou.week4;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
