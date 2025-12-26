package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

// Servlet exceptions
import javax.servlet.ServletException;

// Annotation for URL mapping
import javax.servlet.annotation.WebServlet;

// HttpServlet classes
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL pattern to access servlet
@WebServlet("/callingServlet1")
public class Servlet1 extends HttpServlet {

    // Instance variables
    int a = 100;
    int b = 200;

    // Method to add two numbers
    public int add() {
        return a + b;
    }

    // service() method handles request
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // Set response type
        resp.setContentType("text/html");

        // PrintWriter to send output to browser
        PrintWriter out = resp.getWriter();

        // Display result
        out.println("This is by Servlet: " + add());
    }
}
