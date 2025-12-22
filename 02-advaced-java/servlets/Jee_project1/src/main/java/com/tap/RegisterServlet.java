package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import com.tap.deo.StudentDAO;
import com.tap.models.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tap.com.deoimpl.StudentDAOimpl;

public class RegisterServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		String email=req.getParameter("email");
		String department=req.getParameter("department");
		String address=req.getParameter("address");
		
		
		Student student=new Student(name, age, email, department, address);
		
		StudentDAO impl=new StudentDAOimpl();
		
		int res=impl.addStudent(student);
		
		PrintWriter out=resp.getWriter();
		
		if(res==1) {
			out.println("Hi "+name+" Registration Successful");
		}
		else {
			out.println("Hi "+name+" Registration Failed");
		}
		
		
		
		System.out.println("Hi from RegisterServlet");
	}

}
