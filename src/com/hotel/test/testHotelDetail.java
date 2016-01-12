package com.hotel.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hotel.beans.*;

import com.hotel.persistancce.HibernateUtil;

public class testHotelDetail {

	public static void main(String[] args) {
		Session session1 =HibernateUtil.getSessionFactory().openSession();
	    Transaction tx1=session1.beginTransaction();
	    
	  
	   //HotelChambre
	    HotelDetail ch=new HotelDetail();
	    Hotel hotel=new Hotel();
	    hotel.setIdHotel(2);
	    ch.setIdHotel(2);
	    ch.setDescription("luxe,bon service");
	    ch.setAdresse("adresse");;
	    session1.save(ch);
	   // hotel.setAdresse("62105 rue belhassen,hammetSud");
	    //hotel.setDescription("hotel de luxe");
	    hotel.setGradhotel(3);
	    hotel.setNomHotel("BergeLuck");
	    hotel.setPrixhotel(232);
	   // hotel.setImaghot("indisponible");
	   // hotel.setVillehot("Hammet");
	    hotel.setHoteldetails(ch);
	   
	    session1.save(ch);
	    session1.save(hotel);
	   
	    
	    
	    tx1.commit();
	    session1.close(); 
	    // HibernateUtil.shutdown();
	}

}
