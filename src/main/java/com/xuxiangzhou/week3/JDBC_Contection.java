package com.xuxiangzhou.week3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Contection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
//        2.获取链接
        String url="jdbc:mysql://127.0.0.1:3306/stu";//可简化书写“jdbc:mysql:///test”
        String username="root";
        String password="1234";
        Connection conn = DriverManager.getConnection(url, username, password);
//        3.定义SQL语句
        String sql="update stu  set Class=2 where id=1;";
//        4.获取执行SQL对象statement
        Statement statement = conn.createStatement();
//        5.执行SQL
        int count = statement.executeUpdate(sql);
//        6.处理结果
        System.out.println(count);
//        7.释放资源
        statement.close();
        conn.close();

    }
}
