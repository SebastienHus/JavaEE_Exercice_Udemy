package com.directmedia.onlineStore.frontOffice.controller;

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
		response.getWriter().append("<!DOCTYPE html>" + 

				"<html>" + 

					"<head>\r\n" + 
				
					"<meta charset=\"utf-8\">" + 
					
						"<title>Online Store</title>" + 
				
					"</head>" + 

					
					"<body>" + 
				
						"<header>" + 
				
						"<h1>Online Store</h1>" + 
				
							"<p>\"Votre boutique multimedia en ligne\"</p>" + 
							
							"<nav>" +
		
								"<a href='/catalogue' title='Accès au catalogue des oeuvres' >Catalogue</a> " +
								
							"</nav>" +
				
						"</header>" + 
			 
					"</body>" + 
				
				"</html>");
	}


}
