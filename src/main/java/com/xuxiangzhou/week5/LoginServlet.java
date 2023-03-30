package com.xuxiangzhou.week5;

import com.xuxiangzhou.week4.pojo.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    user User=new user();

    @Override
    public void init(ServletConfig config) throws ServletException {
        String driver = config.getServletContext().getInitParameter("driver");
        String url = config.getServletContext().getInitParameter("url");
        String username = config.getServletContext().getInitParameter("username");
        String password = config.getServletContext().getInitParameter("password");
//        System.out.println(driver+"\n"+url);

        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, username, password);
//            String sql1="INSERT INTO `user` VALUES("2021211001001021","xuxiangzhou","1234","17251692892qq.com","男","2023-3-25")";
            Statement stmt = conn.createStatement();
//            stmt.executeUpdate(sql1);
            ResultSet rs = stmt.executeQuery("select * from user");
            while (rs.next()) {

                User.setId(rs.getString("Id"));
                User.setUserName(rs.getString("UserName"));
                User.setPassword(rs.getString("password"));
                User.setEmail(rs.getString("Email"));
                User.setGender(rs.getString("Gender"));
                User.setBirthdate(rs.getString("Birthdate"));
                System.out.println(User.toString());

            }
            rs.close();
            stmt.close();
            conn.close();


        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

        @Override
        protected void doGet (HttpServletRequest request, HttpServletResponse response) throws
        ServletException, IOException {

        }

        @Override
        protected void doPost (HttpServletRequest request, HttpServletResponse response) throws
        ServletException, IOException {

        }
    }

