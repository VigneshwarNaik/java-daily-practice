package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	int count=3;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

    	
        String oldPassword = "feb2025";

        String name = req.getParameter("username");
        String newPassword = req.getParameter("password");
        
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        if (oldPassword.equals(newPassword)) {
            out.println("Hi " + name + " Welcome to HomePage");
        } else if(count>0) {
            out.println("Invalid Password "+count+ "attempt left");
            RequestDispatcher rd=req.getRequestDispatcher("index.html");
            rd.include(req, resp);
            count--;
        }
        else {
        	out.println("Attempts over Contact Admin");
        }
    }
}
