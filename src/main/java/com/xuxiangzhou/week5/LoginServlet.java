package com.xuxiangzhou.week5;
import com.xuxiangzhou.dao.UserDao;
import com.xuxiangzhou.model.User;

import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    Connection con = null;
    @Override
    public void init() throws ServletException {
        con =(Connection)getServletContext().getAttribute("sql");

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doPost(request, response);
        request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
    }
    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out=response.getWriter();
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        UserDao userDao=new UserDao();
        try {
            User user = userDao.findByUsernamePassword(con, username, password);
            if (user!=null){
                request.getRequestDispatcher("WEB-INF/Views").forward(request,response);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}