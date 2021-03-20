package com.simplilearn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class posthandler
 */
@WebServlet(description = "the check the servlet post request", urlPatterns= { "/posthandler" })
public class PostHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get user and address from html form
		String username = request.getParameter("username");
		String address = request.getParameter("address");
		
		//print user & pass to screen	
		PrintWriter out= response.getWriter();
		out.println("Your username is : " + username);
		out.println("Your Address is : " + address);
	}

}
