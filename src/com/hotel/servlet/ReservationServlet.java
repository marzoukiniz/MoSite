package com.hotel.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.beans.Hotel;
import com.hotel.service.ReservationServImpl;
import com.hotel.service.ReservationServInterface;
import com.hotel.service.hotelServiceImplement;
import com.hotel.service.hotelserviceInterface;
import com.hotel.beans.Reservation;
/**
 * Servlet implementation class ReservationServlet
 */
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ReservationServInterface ReservationServImp=new ReservationServImpl();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		

		List<Reservation> l=ReservationServImp.getReservations();
		System.out.println("liste servelet :"+l);
		request.setAttribute("l",l);
	
		this.getServletContext().getRequestDispatcher("/Reservation.jsp").forward(request,response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
