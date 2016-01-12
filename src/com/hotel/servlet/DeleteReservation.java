package com.hotel.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.beans.Client;
import com.hotel.beans.Reservation;
import com.hotel.service.ReservationServImpl;
import com.hotel.service.ReservationServInterface;
import com.hotel.service.clientServiceImpl;
import com.hotel.service.clientServiceInterface;

/**
 * Servlet implementation class DeleteReservation
 */
public class DeleteReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteReservation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		 String id=request.getParameter("id");
	       int idR=Integer.parseInt(id);
	       
		Reservation res=new Reservation();
	    List<Reservation> r=null;

ReservationServInterface rs= new ReservationServImpl();
res=rs.findById(idR); // rechercher la reservation  a supprimer selom son id "id"
rs.deletReservation(res);      // appel de la methode deleteReservation qui supprime la reservation  trouvé et qui prend comme param l'objet client
	
response.sendRedirect(request.getContextPath() + "/ReservationServlet"); // redirection au servletd'affichage de la liste des reservations

	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
