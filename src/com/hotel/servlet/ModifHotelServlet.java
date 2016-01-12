package com.hotel.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.beans.Hotel;
import com.hotel.service.hotelServiceImplement;
import com.hotel.service.hotelserviceInterface;

/**
 * Servlet implementation class ModifHotelServlet
 */
public class ModifHotelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifHotelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		 String id=request.getParameter("id");
	       int idH=Integer.parseInt(id);
	       
		Hotel h=new Hotel();
	

hotelserviceInterface hs= new hotelServiceImplement();
h=(Hotel) hs.findById(idH); // rechercher l'hotel a modifier selom son id "idh"
  System.out.println( "this is my hotel"+h.getNomHotel());
request.setAttribute("h",h);

this.getServletContext().getRequestDispatcher("/ModifHotel.jsp").forward(request,response);

//response.sendRedirect(request.getContextPath() + "/ModifHotel.jsp"); // redirection au formulaire de modification du hotel

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  String id= request.getParameter("idh"); 
	       int idm=Integer.parseInt(id);
		  String nom=request.getParameter("nomh");
		  String grad=request.getParameter("gradh");
		
		  String prix=request.getParameter("prixh");
		  String	nbr=request.getParameter("nbr");
		  
		  Hotel h2=new Hotel();
		  hotelserviceInterface hs= new hotelServiceImplement();
		  h2=(Hotel) hs.findById(idm); // rechercher l'hotel a modifier selom son id "idh"
		  h2.setGradhotel(Integer.parseInt(grad));
		  h2.setNomHotel(nom);
		  h2.setNbrChambres(Integer.parseInt(nbr));
		  h2.setPrixhotel(Double.parseDouble(prix));
		hs.updateHotel(h2);
		response.sendRedirect(request.getContextPath() + "/hotelServlet");
	}

}
