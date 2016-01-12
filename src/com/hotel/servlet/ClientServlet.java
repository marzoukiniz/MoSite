package com.hotel.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.beans.Client;
import com.hotel.beans.Hotel;
import com.hotel.service.*;
/**
 * Servlet implementation class ClientServlet
 */
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    clientServiceInterface CSI=new clientServiceImpl();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Client> l=CSI.getClients();
		System.out.println("liste servelet :"+l);
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
