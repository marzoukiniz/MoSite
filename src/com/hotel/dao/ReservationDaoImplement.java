
package com.hotel.dao;

import java.util.Iterator;
import java.util.List;



import org.hibernate.*;

import com.hotel.beans.Client;
import com.hotel.beans.Hotel;
import com.hotel.beans.Reservation;
import com.hotel.persistancce.HibernateUtil;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

	public class ReservationDaoImplement implements ReservationDaoInterface{
	
	
	
	
		
		
		 public List<Reservation> getReservations() {
		        List<Reservation> listRes = null;
		        Session session = HibernateUtil.getSessionFactory().openSession();
		        try {
		            session.beginTransaction();
		            listRes = session.createQuery("from  Reservation ").list();
		            session.getTransaction().commit();
		            session.close();
		        } catch (Exception e) {
		            System.out.print("erreur Select all " + e.getMessage());
		            session.beginTransaction().rollback();
		            return listRes;
		           
		        }
		        return listRes;
		    }

		
	public List<Reservation> getReservations2() {
		 List<Reservation> listReservation = null;
		
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            session.beginTransaction();
	            listReservation = session.createQuery("from  Reservation r , Client c where r.client = :c.id").list();
	            
	            session.getTransaction().commit();
	           
	            session.close();
	            System.out.println("vous etes ici");
	           
	        } catch (Exception e) {
	            System.out.print("erreur Select all " + e.getMessage());
	            session.beginTransaction().rollback();
	           
	        }
	        
	       // System.out.println("liste dao est "+listReservation.get(0).getIdreser());
	       

	        return listReservation;
	    }
	
	// methode de recherche
	public List<Hotel> getHotelsRech( String price ) {
		 List<Hotel> listhotel = null;
		
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            session.beginTransaction();
	            
	          
	            listhotel = session.createQuery("from Hotel h  where h.nomHotel like :price").setString("price", "%'" + price + "'%").list();
	            
	            session.getTransaction().commit();
	           
	            session.close();
	           
	        } catch (Exception e) {
	            System.out.print("erreur Select all " + e.getMessage());
	            session.beginTransaction().rollback();
	           
	        }
	        
	        System.out.println("liste dao est "+listhotel.get(0));
	        Iterator<Hotel> i=listhotel.iterator();
	        while(i.hasNext()){
	           	System.out.println(i.next().getIdHotel());
	        }

	        return listhotel;
	    }
	

		@Override
	public Reservation findById(int id){
		Reservation r = new Reservation();
	
		
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Query q= session.createQuery("from Reservation where idreser ="+id );
             r = (Reservation) q.uniqueResult();
            
            session.getTransaction().commit();
           
            session.close();
           
        } catch (Exception e) {
            System.out.print("erreur Select all " + e.getMessage());
            session.beginTransaction().rollback();
           
        }
        


        return r;
    }
	

	/*@Override
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
*/
	    public void updateReservation(Reservation Reservation){	 
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            session.beginTransaction();
	            session.update(Reservation);
	            session.getTransaction().commit();
	            session.close();
	            System.out.print("hotel bien ajouté");
	        } catch (Exception e) {
	            System.out.print("erreur mise a jour " + e.getMessage());
	        }
	    }
	
    public void deletReservation(Reservation Reservation) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.delete(Reservation);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.print("erreur suppression " + e.getMessage());
            session.beginTransaction().rollback();
        }
    }
 
	
	}
	
	


