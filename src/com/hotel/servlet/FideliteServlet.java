package com.hotel.servlet;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.beans.Reservation;
import com.hotel.dao.FideliteDao;
import com.hotel.beans.Client;
/**
 * Servlet implementation class FideliteServlet
 */
public class FideliteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FideliteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		FideliteDao fd=new FideliteDao();
		List<Reservation> l=null;
		l=fd.getReservations();
		BigInteger x=null;
	
		x=fd.getFidelite(4);
		request.setAttribute("x", x);
		request.setAttribute("l", l);
		this.getServletContext().getRequestDispatcher("/Fidelite.jsp").forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
