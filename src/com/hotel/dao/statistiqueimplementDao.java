package com.hotel.dao;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import com.hotel.persistancce.HibernateUtil;

public class statistiqueimplementDao implements statistiqueinterfaceDao {

	@Override
	public int statClients() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List nombreclient=null;
		int cptt=0;
		
		
	    try {
		 nombreclient= session.createQuery("from Client").list();
	        
         
         Iterator ii=nombreclient.iterator();
         
         while(ii.hasNext()){
      	   System.out.println(ii.next());
      	   cptt=cptt+1;
         }
         //System.out.println("nombreclient"+cptt);
     
  
 
  session.getTransaction().commit();
 
    session.close();
	    
	 } catch (Exception e) {
	        System.out.print("erreur Select all " + e.getMessage());
	        //session.beginTransaction().rollback();
	       
	    }
	    return cptt;
	    
	    
	    
	}

	@Override
	public int statClientReservation() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		List nombreclientresertotal=null;
		
		int cpt=0;
		
		
		
	    try {
	    	
	        session.beginTransaction();
	        nombreclientresertotal= session.createQuery("from Reservation r , Client c where r.client=c.id").list();
		    Iterator i=nombreclientresertotal.iterator();
	           
	           while(i.hasNext()){
	        	   System.out.println(i.next());
	        	   cpt=cpt+1;
	           }
	    session.getTransaction().commit();
	 
	    session.close();
		    
		 } catch (Exception e) {
		        System.out.print("erreur Select all " + e.getMessage());
		        //session.beginTransaction().rollback();
		       
		    }
		    return cpt;
	}

	@Override
	public BigDecimal statNombreReservation() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		List nombreclientresertotal=null;
		
		BigDecimal sumnbrreservation=null;
		
		
		
	    try {
	    	
	        session.beginTransaction();
	        sumnbrreservation=(BigDecimal)session.createSQLQuery("select sum(cat.nbCh) as cal from Reservation cat").uniqueResult();
		    
	           
	          
	    session.getTransaction().commit();
	 
	    session.close();
		    
		 } catch (Exception e) {
		        System.out.print("erreur Select all " + e.getMessage());
		        //session.beginTransaction().rollback();
		       
		    }
		    return sumnbrreservation;
	}
	}


