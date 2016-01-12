package com.hotel.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.beans.Client;
import com.hotel.beans.Hotel;
import com.hotel.service.clientServiceImpl;
import com.hotel.service.clientServiceInterface;
import com.hotel.service.hotelServiceImplement;
import com.hotel.service.hotelserviceInterface;

/**
 * Servlet implementation class AjoutClientServlet
 */
public class AjoutClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		  String nom=request.getParameter("nom");
		  String prenom=request.getParameter("prenom");
		  String cin=request.getParameter("cin");
		  String email=request.getParameter("email");
		  String login=request.getParameter("login");
		  String password=request.getParameter("password");
		  String niveau=request.getParameter("niveau");
		  String statut=request.getParameter("statut");

		  Client cl=new Client();
		  
		  clientServiceInterface cs= new clientServiceImpl();
		  cl.setCin(Integer.parseInt(cin));
		  cl.setEmail(email);
		  cl.setLogin(login);
		  cl.setPassword(password);
		  cl.setNiveau(niveau);
		  cl.setNom(nom);
		  cl.setPrenom(prenom);
		  cl.setStatut(statut);
		  
		
		  cs.addClient(cl);
		   
		response.sendRedirect(request.getContextPath() + "/ClientServlet");
	
	}

}
