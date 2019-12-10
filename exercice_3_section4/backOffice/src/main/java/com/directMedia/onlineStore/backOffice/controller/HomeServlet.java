package com.directMedia.onlineStore.backOffice.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<!DOCTYPE html>\r\n" + 
				"\r\n" + 
				"<html>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<head>\r\n" + 
				"\r\n" + 
				"<meta charset=\"utf-8\">\r\n" + 
				"\r\n" + 
				"<title>Online Store</title>\r\n" + 
				"\r\n" + 
				"</head>\r\n" + 
				"\r\n" + 
				"<!--  -->\r\n" + 
				"\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<header>\r\n" + 
				"\r\n" + 
				"<h1> Online Store</h1>"
				+ "<p> Gestion de la boutique</p>\r\n" + 
				"\r\n" + 
				"</header>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"\r\n" + 
				"</html>");
	}


}
