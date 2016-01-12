package com.hotel.servlet;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.service.ServeletStatisService;
import com.hotel.service.StatistiquesServlet;


public class Statistisques extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StatistiquesServlet ss=new ServeletStatisService();
    
    public Statistisques() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cptt=ss.statClients();
		int cpt=ss.statClientReservation();
		int nonclientreser=cptt-cpt;
		BigDecimal nbre=ss.statNombreReservation();
		
		request.setAttribute("cptt",cptt);
		request.setAttribute("cpt",cpt);
		request.setAttribute("nonclientreser",nonclientreser);
		request.setAttribute("nbre",nbre);
		this.getServletContext().getRequestDispatcher("/statistique.jsp").forward(request, response);

	}

	

}
