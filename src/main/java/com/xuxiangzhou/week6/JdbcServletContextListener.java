package com.xuxiangzhou.week6;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Connection;
import java.sql.DriverManager;
@WebListener
public class JdbcServletContextListener implements ServletContextListener {

    public JdbcServletContextListener() {
        System.out.println("-----");
    }
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Connection dbConn;
        ServletContext c = sce.getServletContext();
//        System.out.println("进入了contextInitialized方法");
//        System.out.println(c.getInitParameter("url"));
        try {
            Class.forName(c.getInitParameter("driver"));
            dbConn = DriverManager.getConnection(c.getInitParameter("url"),
                    c.getInitParameter("Username"),
                    c.getInitParameter("Password"));
            c.setAttribute("dbConn",dbConn);
//            System.out.println(dbConn);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
