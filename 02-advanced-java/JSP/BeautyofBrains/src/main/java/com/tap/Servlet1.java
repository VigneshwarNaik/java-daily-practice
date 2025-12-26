package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/callingServlet1")
public class Servlet1 extends HttpServlet {
	
	int add(int a,int b){
		return a+b;
	}
	
	int sub(int a,int b){
		return a-b;
	}
	
	int mul(int a,int b){
		return a*b;
	}
	
	int div(int a,int b){
		return a/b;
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		
		out.println(add(5, 5));
		out.println(sub(15, 5));
		out.println(mul(5, 5));
		out.println(div(15, 5));
		
		
		
	}

}
