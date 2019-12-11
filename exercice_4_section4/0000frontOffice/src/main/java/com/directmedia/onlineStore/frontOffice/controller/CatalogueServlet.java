package com.directmedia.onlineStore.frontOffice.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.directMedia.onlineStore.core.entity.Artist;
import com.directMedia.onlineStore.core.entity.Catalogue;
import com.directMedia.onlineStore.core.entity.Work;

/**
 * Servlet implementation class CatalogueServlet
 */
@WebServlet("/catalogue")
public class CatalogueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CatalogueServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(Catalogue.listOfWorks.isEmpty())
		{
			Artist artist1 = new Artist("Bob");
			Artist artist2 = new Artist("Alfred");
			Artist artist3 = new Artist("Catarina");
			
			Work work1 = new Work("La reine des neiges");
			Work work2 = new Work("Zombilenium");
			Work work3 = new Work("Avatar37");
			
			work1.setMainArtist(artist1);
			work2.setMainArtist(artist2);
			work3.setMainArtist(artist3);
			
			work1.setRelease(2000);
			work2.setRelease(1900);
			work3.setRelease(2020);
			
			work1.setSummary("Un film galciale");
			work2.setSummary("Sauve qui peut");
			work3.setSummary("Il vas falloir soufler dans les bronch du pays du feu pour qui se carbonise avant qu'il nenous carbonise !");
			
			work1.setKind("FILM");
			work2.setKind("FILM");
			work3.setKind("FILM");
			
			
			Catalogue.listOfWorks.add(work1);
			Catalogue.listOfWorks.add(work2);
			Catalogue.listOfWorks.add(work3);
		}
		PrintWriter out = response.getWriter();
		
		out.print("<!DOCTYPE html>" + 

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
							
							"<section>");
		
								for (Work listWork : Catalogue.listOfWorks) {
									
									
									out.println(listWork.getTitle() + " sortis en : " + listWork.getSummary() + "<br>");
								} 
		
							out.print("</section>" +
				
						"</header>" + 
			 
					"</body>" + 
				
				"</html>");
	}

}
