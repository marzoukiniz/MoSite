package com.hotel.test;

import java.util.Iterator;
import java.util.List;



import org.hibernate.*;

import com.hotel.beans.Reservation;
import com.hotel.persistancce.HibernateUtil;

public class testfidel {

	public static void main(String[] args) {
		

			
			
				List<Reservation> fidel=null;
			
				
		        Session session = HibernateUtil.getSessionFactory().openSession();
		        try {
		            session.beginTransaction();
		            Query q= session.createQuery("from Reservation r , Client h where r.client=h.id and h.id=4" );
		           
		           fidel=q.list();
		           
		           Iterator i=fidel.iterator();
		           int cpt=0;
		           while(i.hasNext()){
		        	   System.out.println(i.next());
		        	   cpt=cpt+1;
		           }
                 System.out.println("voici le nombre fidel "+cpt);
		            session.getTransaction().commit();
		           
		            session.close();
		          
		            
		            System.out.println("fid2el"+fidel);
		            
		           
		        } catch (Exception e) {
		            System.out.print("erreur Select all " + e.getMessage());
		            session.beginTransaction().rollback();
		           
		        }
		       System.out.println("kkkk"+fidel);
			}




	}


