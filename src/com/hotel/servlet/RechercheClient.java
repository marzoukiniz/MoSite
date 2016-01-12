package com.hotel.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.beans.Client;
import com.hotel.beans.Hotel;
import com.hotel.dao.clientDaoImplement;
import com.hotel.dao.hotelDaoImplement;

/**
 * Servlet implementation class RechercheClient
 */
public class RechercheClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RechercheClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String var=request.getParameter("var");

		clientDaoImplement cdao= new clientDaoImplement();
		List<Client> l=cdao.getClientsRech(var);
		//System.out.println("liste servelet :"+l);
		request.setAttribute("l",l);
		this.getServletContext().getRequestDispatcher("/Client.jsp").forward(request,response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
