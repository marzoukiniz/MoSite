package com.hotel.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;


import com.hotel.dao.UserDao;
import com.hotel.persistancce.HibernateUtil;
import com.hotel.service.clientServiceInterface;
import com.hotel.service.clientServiceImpl;


public class clientConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	clientServiceInterface clientdaointerface=new clientServiceImpl();
	
    
    public clientConnexionServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String vue;
		String userlogin = request.getParameter("login");
		String userpassword = request.getParameter("pwd");
		
		
		//méthode de la connexion
			
		        boolean result = UserDao.login(userlogin, userpassword);
		        if (result) {
		        	
		            // get Http Session and store username
		            SessionFactory session = HibernateUtil.getSessionFactory();
		            ((ServletRequest) session).setAttribute("username", userlogin);
		            
		            ((ServletRequest) session).setAttribute("password", userpassword);
		       
		            //return "/Client/accueil?faces-redirect=true";
					response.sendRedirect(request.getContextPath() + "/home.jsp");

		            }
		        else {
					response.sendRedirect(request.getContextPath() + "/Acceuil.jsp");

		        }
		     
		   
			
		 //********************************************************
		/*boolean t=clientdaointerface.verificationMotdepasseLogin(login, mot_de_passe);
		
		if(t==true) {
			vue="/Acceuil.jsp";
			HttpSession session=request.getSession();
			session.setAttribute("login", login);
			session.setAttribute("motdepasse", mot_de_passe);
			this.getServletContext().getRequestDispatcher(vue).forward(request, response);
			
			
		}
		else{
			vue="/authentification.jsp";
			this.getServletContext().getRequestDispatcher(vue).forward(request, response);
			
		}*/
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		
		
	}

}
