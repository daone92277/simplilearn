package com.simplilearn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getHandler
 */
@WebServlet(description = "page to pull information from server", urlPatterns = { "/getHandler" })
public class getHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String address = request.getParameter("address");
		
		//print user & pass to screen	
		PrintWriter out= response.getWriter();
		out.println("Your username is : " + username);
		out.println("Your Address is : " + address);

		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
