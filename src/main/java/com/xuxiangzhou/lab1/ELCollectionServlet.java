package com.xuxiangzhou.lab1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ELCollectionServlet", value = "/elc")
public class ELCollectionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String[] firstName = {"Bill", "Scott", "Larry", "xiangzhou"};
        List<String> lastName = new ArrayList<>();
        lastName.add("Ellison");
        lastName.add("Gates");
        lastName.add("McNealy");
        lastName.add("Xu");
        //Map
        Map<String, String> company = new HashMap<String, String>();
        company.put("Ellison", "Sun");
        company.put("Gates", "IBM");
        company.put("McNealy", "Microsoft");
        company.put("Xu", "ECJTU");

        request.setAttribute("fName", firstName);
        request.setAttribute("lName", lastName);
        request.setAttribute("co        mpany", company);

        request.getRequestDispatcher("elcollection.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
