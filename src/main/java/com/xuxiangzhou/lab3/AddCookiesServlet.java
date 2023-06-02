package com.xuxiangzhou.lab3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddCookiesServlet", value = "/add_cookies")
public class AddCookiesServlet extends HttpServlet {
    private static int cookieCount;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name ="Cookies" +(++cookieCount);
        String value=String.valueOf(System.currentTimeMillis());


        Cookie cookie =new Cookie(name,value);

        response.addCookie(cookie);
        response.getWriter().println("A cookies has been created successfully!");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
