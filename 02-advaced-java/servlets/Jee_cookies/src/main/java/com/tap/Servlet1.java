package com.tap;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		Cookie c1=new Cookie("username",username);
		Cookie c2=new Cookie("password",password);
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		
		System.out.println("cookies added successfully.");
		resp.sendRedirect("callingServlet2");
	}

}
