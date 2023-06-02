package com.xuxiangzhou.lab3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DeleteServlet", value = "/delete_cookies")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer =response.getWriter();
        Cookie[] cookies =request.getCookies();

        if(cookies != null){
            for(Cookie aCookie : cookies){
                aCookie.setMaxAge(0);
                response.addCookie(aCookie);
            }
            writer.println("All cookies have been deleted!");
        }else {
            writer.println("No cookies found");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
