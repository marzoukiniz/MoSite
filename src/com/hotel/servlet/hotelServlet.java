package com.hotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.*;
import com.hotel.beans.Hotel;
//import com.hotel.beans.Panier;
import com.hotel.service.hotelServiceImplement;
import com.hotel.service.hotelserviceInterface;


public class hotelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       hotelserviceInterface hotelserviceinterface=new hotelServiceImplement();
      // List<Panier>liste;
      
   
    public hotelServlet() {
        super();
 
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		request.setAttribute("liste", session.getAttribute("liste"));
		request.setAttribute("totalmontant", session.getAttribute("totalmontant"));;
		
		List<Hotel> l=hotelserviceinterface.getHotels();
		System.out.println("liste servelet :"+l);
		request.setAttribute("l",l);
	
		this.getServletContext().getRequestDispatcher("/Hotel.jsp").forward(request,response);
		
		//this.getServletContext().getRequestDispatcher("/WEB-INF/viewCandidat/DetaillerOffreParCandidat.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
