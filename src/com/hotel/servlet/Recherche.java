package com.hotel.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.beans.Hotel;
import com.hotel.dao.hotelDaoImplement;
import com.hotel.service.hotelServiceImplement;
import com.hotel.service.hotelserviceInterface;

/**
 * Servlet implementation class Recherche
 */
public class Recherche extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Recherche() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nomHotel=request.getParameter("price");

		hotelDaoImplement hdao= new hotelDaoImplement();
		List<Hotel> l=hdao.getHotelsRech(nomHotel);
		//System.out.println("liste servelet :"+l);
		request.setAttribute("l",l);
		this.getServletContext().getRequestDispatcher("/result.jsp").forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
