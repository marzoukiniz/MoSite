package com.hotel.servlet;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.beans.Reservation;
import com.hotel.service.ReservationServImpl;
import com.hotel.service.ReservationServInterface;
import com.hotel.service.hotelServiceImplement;
import com.hotel.service.hotelserviceInterface;

/**
 * Servlet implementation class ModifHotelServlet
 */
public class ModifReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifReservationServlet() {
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
	       
		Reservation h=new Reservation();
	

ReservationServInterface hs= new ReservationServImpl();
h=(Reservation)hs.findById(idH); // rechercher l'hotel a modifier selom son id "idh"
  System.out.println( "this is my hotel"+h.getNbCh());
request.setAttribute("h",h);

this.getServletContext().getRequestDispatcher("/ModifReservation.jsp").forward(request,response);

//response.sendRedirect(request.getContextPath() + "/ModifHotel.jsp"); // redirection au formulaire de modification du hotel

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	String id=request.getParameter("idreser");
	int idr=Integer.parseInt(id);
		  String dateD=request.getParameter("debutreserv");
		  String dateF=request.getParameter("finreserv");
		
		  String nbrch=request.getParameter("nbCh");
		
		  
		  Reservation res2=new Reservation();

ReservationServInterface hs= new ReservationServImpl();
		  res2=(Reservation) hs.findById(idr); // rechercher la reservation a modifier selom son id "idreser"
		
		  
		 
		
		  
		  
		  
		
		res2.setDebutreserv(dateD);
		res2.setFinreserv(dateF);
		 res2.setNbCh(Integer.parseInt(nbrch));
		 
		hs.updateReservation(res2);
		response.sendRedirect(request.getContextPath() + "/ReservationServlet");
	}

}
