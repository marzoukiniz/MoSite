package com.hotel.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hotel.beans.HotelDetail;
import com.hotel.service.detailServiceImplement;
import com.hotel.service.detailServiceInterface;


public class detailHotelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       detailServiceInterface detailserviceinterface=new detailServiceImplement();
       
    
    public detailHotelServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String id=request.getParameter("id");
       int idd=Integer.parseInt(id);
       List<HotelDetail> l=null;
		l=detailserviceinterface.getDetailHotels(idd);
		System.out.println("liste servelet :"+l);
		request.setAttribute("l",l);
	
		this.getServletContext().getRequestDispatcher("/detailList.jsp").forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
