package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/callingServlet")
public class Servlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num=Integer.parseInt(req.getParameter("number"));
		
		PrintWriter out=resp.getWriter();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				out.print("* ");
			}
			out.println();
		}
		
	}
}
