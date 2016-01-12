package com.hotel.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;







import com.hotel.beans.Reservation;
import com.hotel.beans.User;
import com.hotel.persistancce.HibernateUtil;
import com.hotel.beans.Client;
public class FideliteDao  {

	
	public  BigInteger getFidelite(int id) {
		List<Reservation> fidel=null;
		BigInteger nombrelignereserv = null;
		
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            
            
            //BigDecimal sumnbrreservation=(BigDecimal)session.createSQLQuery("select sum(cat.nbCh) as cal from Reservation cat").uniqueResult();
	       nombrelignereserv=(BigInteger )session.createSQLQuery("select count(*) as cal from Reservation r , Client h where r.id="+id).uniqueResult();
	       // Integer maxnbrreserve=(Integer)session.createSQLQuery("select max(cat.nbCh) as cal from Reservation cat where cat.debutreserv=1936-06-23").uniqueResult();

            //Query q= session.createQuery("count (*) from Reservation r , Client h where r.client=h.id " );
           
           //fidel=q.list();
           
            session.getTransaction().commit();
           
            session.close();
          
            
          System.out.println("voici le nombre fidel "+nombrelignereserv);
            System.out.println("fid2el"+fidel);
            
           
        } catch (Exception e) {
            System.out.print("erreur Select all " + e.getMessage());
            //session.beginTransaction().rollback();
           
        }
        return nombrelignereserv;
	}

	

	 public List<Reservation> getReservations() {
	        List<Reservation> listRes = null;
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            session.beginTransaction();

	            listRes = session.createQuery("from Reservation r , Client h where r.client=h.id  group by r.client").list();
	            session.getTransaction().commit();
	            session.close();
	            
	            Iterator i=listRes.iterator();
		           int cpt=0;
		           while(i.hasNext()){
		        	   System.out.println(i.next());
		        	   cpt=cpt+1;
		           }
	            
	        } catch (Exception e) {
	            System.out.print("erreur Select all " + e.getMessage());
	            //session.beginTransaction().rollback();
	            return listRes;
	           
	        }
	        return listRes;
	    }
	
	
}
