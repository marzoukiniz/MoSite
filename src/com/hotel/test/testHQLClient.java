package com.hotel.test;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


import com.hotel.persistancce.HibernateUtil;



public class testHQLClient {

	public static void main(String[] args) {

		Session session =HibernateUtil.getSessionFactory().openSession();
	   //Query q=session.createQuery("select c from Client c where c.login='"+oo+"' c.motdepasse='"+motdepasse+"'");
	   
		 Query q=session.createQuery("from User u  where u.login='oo' and u.password='jesuispalestine'");
	   List l=q.list();
	   if(l.isEmpty()){
	 
		   System.out.println("vide");

	   }else
	    	System.out.println("remplie");
	  


	}

	}
