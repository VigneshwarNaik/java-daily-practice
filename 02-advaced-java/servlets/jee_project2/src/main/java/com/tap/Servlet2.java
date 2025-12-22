package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {

        String name = req.getParameter("username");

        PrintWriter out = resp.getWriter();
        out.println("Hi " + name + " Servlet2");
    }
}
