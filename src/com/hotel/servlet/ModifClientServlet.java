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
 * Servlet implementation class ModifClientServlet
 */
public class ModifClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		 String id=request.getParameter("id");
	       int idc=Integer.parseInt(id);
	       
		Client cl=new Client();
	

		clientServiceInterface cs= new clientServiceImpl();
		
cl=(Client) cs.findById(idc); // rechercher le client a modifier selom son id "id"
System.out.println( "this is my hotel"+cl.getNom());
request.setAttribute("cl",cl);

this.getServletContext().getRequestDispatcher("/ModifClient.jsp").forward(request,response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String id= request.getParameter("id"); 
	       int idc2=Integer.parseInt(id);
		 String nom=request.getParameter("nom");
		  String prenom=request.getParameter("prenom");
		  String cin=request.getParameter("cin");
		  String email=request.getParameter("email");
		  String login=request.getParameter("login");
		  String password=request.getParameter("password");
		  String niveau=request.getParameter("niveau");
		  String statut=request.getParameter("statut");
		  
		  Client cl2=new Client();
		  clientServiceInterface cs= new clientServiceImpl();
		  cl2=(Client) cs.findById(idc2); // rechercher le client a modifier selom son id "id"
		  cl2.setCin(Integer.parseInt(cin));
		  cl2.setEmail(email);
		  cl2.setLogin(login);
		  cl2.setPassword(password);
		  cl2.setNiveau(niveau);
		  cl2.setNom(nom);
		  cl2.setPrenom(prenom);
		  cl2.setStatut(statut);
		  
		cs.updateClient(cl2);
		response.sendRedirect(request.getContextPath() + "/ClientServlet");
		  
		  
		
	}

}
