package com.hotel.dao;

import java.util.Iterator;
import java.util.List;






import org.hibernate.*;

import com.hotel.beans.Client;
import com.hotel.beans.Hotel;
import com.hotel.persistancce.HibernateUtil;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
public class hotelDaoImplement implements HotelDaoInterface {

	
	
	
	@Override
	public List<Hotel> getHotels() {
		 List<Hotel> listhotel = null;
		
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            session.beginTransaction();
	            listhotel = session.createQuery("from Hotel").list();
	            
	            session.getTransaction().commit();
	           
	            session.close();
	           
	        } catch (Exception e) {
	            System.out.print("erreur Select all " + e.getMessage());
	            session.beginTransaction().rollback();
	           
	        }
	        
	        //System.out.println("liste dao est "+listhotel.get(0));
	        Iterator<Hotel> i=listhotel.iterator();
	        while(i.hasNext()){
	           	System.out.println(i.next().getIdHotel());
	        }

	        return listhotel;
	    }
	
	// methode de recherche
	public List<Hotel> getHotelsRech( String nomHotel ) {
		 List<Hotel> listhotel = null;
		
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            session.beginTransaction();
	           
	                                        
	           Query q = session.createQuery("from Hotel  where nomHotel like :nomHotel or prixhotel like :nomHotel");
	  
	            q.setString("nomHotel","%"+nomHotel+"%");
	            listhotel=q.list();
	            session.getTransaction().commit();
	           
	            session.close();
	           
	        } catch (Exception e) {
	            System.out.print("erreur Select all " + e.getMessage());
	            //session.beginTransaction().rollback();
	           
	        }
	        
	       

	        return listhotel;
	    }
	

	@Override
	public Hotel findById(int id) {
		Hotel h = new Hotel();
	
		
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Query q= session.createQuery("from Hotel where IdHotel ="+id );
             h = (Hotel) q.uniqueResult();
            
            session.getTransaction().commit();
           
            session.close();
           
        } catch (Exception e) {
            System.out.print("erreur Select all " + e.getMessage());
            session.beginTransaction().rollback();
           
        }
        


        return h;
    }

	@Override
	public void Update(int id, int nombrechambre) {
		 
			
			
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            //session.beginTransaction();
	            Query q=session.createQuery("from Hotel where IdHotel ="+id );
	            Hotel e = (Hotel) q.uniqueResult();
	            e.setNbrChambres(nombrechambre);
	           System.out.println("nombre de chambre"+e.getNbrChambres());
	            Transaction tx = session.beginTransaction();
	         
	            session.update(e);
	           
	            tx.commit();
	            
	           
	            session.close();
	           
	        } catch (Exception e) {
	            System.out.print("erreur update " + e.getMessage());
	            session.beginTransaction().rollback();
	           
	        }
	        
	}
	public void addHotel(Hotel hotel) {
		 
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(hotel);
            session.getTransaction().commit();
            session.close(); 
            System.out.print("hotel bien ajouté");
        } catch (Exception e) {
            System.out.print("erreur insertion " + e.getMessage());
        }
    }

	 public void updateHotel(Hotel hotel) {
		 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            session.beginTransaction();
	            session.update(hotel);
	            session.getTransaction().commit();
	            session.close();
	            System.out.print("hotel bien ajouté");
	        } catch (Exception e) {
	            System.out.print("erreur mise a jour " + e.getMessage());
	        }
	    }
	
    public void deletHotel(Hotel hotel) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.delete(hotel);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.print("erreur suppression " + e.getMessage());
            session.beginTransaction().rollback();
        }
    }
 
	 
	}
		
	


