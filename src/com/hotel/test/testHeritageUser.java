package com.hotel.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hotel.beans.*;
import com.hotel.persistancce.HibernateUtil;


public class testHeritageUser {

	public static void main(String[] args) {
		Session session1 =HibernateUtil.getSessionFactory().openSession();
	    Transaction tx1=session1.beginTransaction();
	    
	  
	   //Client 
	    Client cl=new Client();
	    cl.setCin(8745275);;
	    cl.setEmail("khalilriahi001@gmail.com");
	    cl.setLogin("khalil.riahi");
	    cl.setPassword("jesuispalestine");
	    cl.setStatut("travaillé");
	    cl.setNom("khalil0");
	    cl.setPrenom("riahi");
	    cl.setNiveau("bac+3");
	    session1.save(cl);
	  
	    
	    //Administrateur
	    Administrateur ad=new Administrateur();
	    ad.setCin(98125467);;
	    ad.setEmail("dzirinizar001@gmail.com");
	    ad.setLogin("dziri.nizar");
	    ad.setPassword("jesuisalgérien");
	    ad.setNom("nizar");
	    ad.setPrenom("Marzouki");
	    ad.setRole("1");
	    session1.save(ad);
	    tx1.commit();
	    session1.close(); 
	    // HibernateUtil.shutdown();
	}

}
