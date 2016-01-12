package com.hotel.servlet;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class DeleteClient
 */
public class DeleteClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		 String id=request.getParameter("id");
	       int idC=Integer.parseInt(id);
	       
		Client cl=new Client();
	    List<Client> l=null;

clientServiceInterface cs= new clientServiceImpl();
cl=cs.findById(idC); // rechercher le client  a supprimer selom son id "id"
cs.deleteClient(cl);      // appel de la methode deleteClient qui supprime le client trouvé et qui prend comme param l'objet client
	
response.sendRedirect(request.getContextPath() + "/ClientServlet"); // redirection au servletd'affichage de la liste des clients

	
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
