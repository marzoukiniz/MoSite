package com.hotel.test;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.hotel.beans.Offre;
import com.hotel.persistancce.HibernateUtil;

public class TestOffreHotelManyToOne {
	public static void main(String[] args) {
		Session session1 =HibernateUtil.getSessionFactory().openSession();
	    Transaction tx1=session1.beginTransaction();
	    
	  
	   //HotelChambre
	   try{ Offre offre=new Offre();
	    offre.setDate(null);
	    offre.setTitre("offre");
	    offre.setDescription("pas des offres ");
	    
	    
	    session1.save(offre);
	    
	    
	    tx1.commit();
	    session1.close(); 
	   //  HibernateUtil.shutdown();
	}catch(Exception e){
		System.out.print("l'erreur est :"+e);
	}
}
}
