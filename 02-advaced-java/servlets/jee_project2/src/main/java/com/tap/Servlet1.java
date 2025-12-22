package com.tap;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {

        // Forward request to Servlet2
        RequestDispatcher rd = req.getRequestDispatcher("/callingServlet2");
        rd.forward(req, resp);
    }
}
