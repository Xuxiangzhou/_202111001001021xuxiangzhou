package com.xuxiangzhou.week4;

import com.xuxiangzhou.week4.pojo.user;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
    user User=new user();
    @Override
    public void init(ServletConfig config) throws ServletException {
        String driver=config.getServletContext().getInitParameter("driver");
        String url=config.getServletContext().getInitParameter("url");
        String username=config.getServletContext().getInitParameter("username");
        String password=config.getServletContext().getInitParameter("password");
//        System.out.println(driver+"\n"+url);

        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, username, password);
//            String sql1="INSERT INTO `User` VALUES("2021211001001021","xuxiangzhou","1234","17251692892qq.com","男","2023-3-25")";
            Statement stmt = conn.createStatement();
//            stmt.executeUpdate(sql1);
            ResultSet rs = stmt.executeQuery("select * from user");
            while (rs.next()){

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


        } catch (SQLException |ClassNotFoundException e) {
            throw new RuntimeException(e);
        }



    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");//这里content Type设置响应数据格式为HTML；charset设置为utf-8支持中文
        PrintWriter writer = response.getWriter();

        writer.write("<table border=\"1\" cellspacing=\"0\">\n" +
                "    <tr>\n" +
                "        <th>Id</th>\n" +
                "        <th>UserName</th>\n" +
                "        <th>password</th>\n" +
                "        <th>Email</th>\n" +
                "        <th>Gender</th>\n" +
                "        <th>Birthdate</th>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td>"+User.getId()+"</td>\n" +
                "        <td>"+User.getUserName()+"</td>\n" +
                "        <td>"+User.getPassword()+"</td>\n" +
                "        <td>"+User.getEmail()+"</td>\n" +
                "        <td>"+User.getGender()+"</td>\n" +
                "        <td>"+User.getBirthdate()+"</td>\n" +
                "\n" +
                "    </tr>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</table>");



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
