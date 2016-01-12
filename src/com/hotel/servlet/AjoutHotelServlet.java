package com.hotel.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.beans.Hotel;
import com.hotel.beans.HotelDetail;
import com.hotel.service.hotelServiceImplement;
import com.hotel.service.hotelserviceInterface;

/**
 * Servlet implementation class AjoutHotelServlet
 */
public class AjoutHotelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutHotelServlet() {
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
	       
		Hotel h=new Hotel();
	

hotelserviceInterface hs= new hotelServiceImplement();
h=(Hotel) hs.findById(idH); // rechercher l'hotel a modifier selom son id "idh"
System.out.println( "this is my hotel"+h.getNomHotel());
request.setAttribute("h",h);

this.getServletContext().getRequestDispatcher("/AjoutHotel.jsp").forward(request,response);

	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id= request.getParameter("idh"); 
	       //int idm=Integer.parseInt(id);
		  String nom=request.getParameter("nomh");
		  String grad=request.getParameter("gradh");
		
		  String prix=request.getParameter("prixh");
		  String	nbr=request.getParameter("nbr");
		  String ville=request.getParameter("ville");
		  String desc=request.getParameter("desc");
		  String adresse=request.getParameter("adresse");


		  Hotel h2=new Hotel();
		 HotelDetail hd=new HotelDetail();
		  hotelserviceInterface hs= new hotelServiceImplement();
		 // h2=(Hotel) hs.findById(idm); // rechercher l'hotel a modifier selom son id "idh"
		  h2.setGradhotel(Integer.parseInt(grad));
		  h2.setNomHotel(nom);
		  h2.setNbrChambres(Integer.parseInt(nbr));
		  h2.setPrixhotel(Double.parseDouble(prix));
		  String format=".jpg";
		  String img=nom+format;
		  h2.setImaghot(img);
		hd.setAdresse(adresse);
		hd.setDescription(desc);
		hd.setVillehot(ville);
		hd.setNbrChambres(Integer.parseInt(nbr));
		hd.setIdHotel(h2.getIdHotel());
		hd.setHotels(h2);
		h2.setHoteldetails(hd);
		   hs.addHotel(h2);
		   
		response.sendRedirect(request.getContextPath() + "/hotelServlet");
	}

}
