package com.epam.adk.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TODO: Comment
 * <p>
 * Created on 7/3/2017.
 *
 * @author Kaikenov Adilkhan
 */
public class Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("In the Servlet doGet() method: ");

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
