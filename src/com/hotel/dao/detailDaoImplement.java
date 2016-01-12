package com.hotel.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;



import com.hotel.beans.HotelDetail;
import com.hotel.persistancce.HibernateUtil;

public class detailDaoImplement implements detailDaoInterface{

	@Override
	public List<HotelDetail> getDetailHotels(int id) 
{
		
		List<HotelDetail> detailthotel = null;
	
		
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Query q= session.createQuery("from HotelDetail where IdHotel ="+id );
            //q.setInteger(id, id);
            detailthotel=q.list();
            
            session.getTransaction().commit();
           
            session.close();
           
        } catch (Exception e) {
            System.out.print("erreur Select all " + e.getMessage());
            session.beginTransaction().rollback();
           
        }
        
        System.out.println("liste dao est "+detailthotel.get(0));


        return detailthotel;
    }
	

}
