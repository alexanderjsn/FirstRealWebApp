package org.example.FirstRealWebApp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/index")
public class servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String hello = "Servlet funkar";
        request.setAttribute("greeting", hello);
        request.setAttribute("message", "Hello, World from Servlet!");
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}