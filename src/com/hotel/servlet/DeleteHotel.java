package com.hotel.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.beans.Hotel;
import com.hotel.beans.HotelDetail;

import java.util.*;

//import com.hotel.beans.Panier;
import com.hotel.service.hotelServiceImplement;
import com.hotel.service.hotelserviceInterface;
/**
 * Servlet implementation class DeleteHotel
 */
public class DeleteHotel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteHotel() {
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
	    List<Hotel> l=null;

hotelserviceInterface hs= new hotelServiceImplement();
h=(Hotel) hs.findById(idH); // rechercher l'hotel a supprimer selom son id "idh"
hs.deleteOneHotel(h);      // appel de la methode deleteOneHotel qui supprime l'hotel trouvé et qui prend comme param l'objet hotel
	
 response.sendRedirect(request.getContextPath() + "/hotelServlet"); // redirection au servletd'affichage de la liste des hotels

	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
	}

}
