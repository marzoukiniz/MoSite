package com.hotel.dao;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hotel.beans.*;
import com.hotel.persistancce.HibernateUtil;
import com.hotel.beans.Client;




import com.hotel.beans.Hotel;

import org.hibernate.Query;


public class clientDaoImplement implements clientDaoInterface{
	
	
	
	
	
	public List<Client> getClients() {
		 List<Client> listclient = null;
		
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            session.beginTransaction();
	            listclient = session.createQuery("from Client").list();
	            
	            session.getTransaction().commit();
	           
	            session.close();
	           
	        } catch (Exception e) {
	            System.out.print("erreur Select all " + e.getMessage());
	            session.beginTransaction().rollback();
	           
	        }
	        
	      //  System.out.println("liste dao est "+listclient.get(0));
	        Iterator<Client> i=listclient.iterator();
	        while(i.hasNext()){
	           	System.out.println(i.next().getNom());
	        }

	        return listclient;
	    }
	
	// methode de recherche d'un client selon le nom
	public List<Client> getClientsRech( String nom ) {
		 List<Client> listclient = null;
		
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            session.beginTransaction();
	           
	                                        
	           Query q = session.createQuery("from Client  where nom like :nom  or prenom like :nom or login like :nom");
	  
	            q.setString("nom","%"+nom+"%");
	            listclient=q.list();
	            session.getTransaction().commit();
	           
	            session.close();
	           
	        } catch (Exception e) {
	            System.out.print("erreur Select all " + e.getMessage());
	            //session.beginTransaction().rollback();
	           
	        }
	        
	       

	        return listclient;
	    }
	
	
	@Override
	public Client findById(int id) {
		Client cl = new Client();
	
		
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Query q= session.createQuery("from Client where id ="+id );
             cl = (Client) q.uniqueResult();
            
            session.getTransaction().commit();
           
            session.close();
           
        } catch (Exception e) {
            System.out.print("erreur Select all " + e.getMessage());
            session.beginTransaction().rollback();
           
        }
        


        return cl;
    }
	
	
	
	
	private SessionFactory sessionFactory= HibernateUtil.getSessionFactory();;
	
	 public SessionFactory getSessionFactory() {
	
	  return sessionFactory;
	
	 }
	
	
	 public void setSessionFactory(SessionFactory sessionFactory) {
	
	        this.sessionFactory = sessionFactory;
	
	    }
	
	 public void addClient(Client client) {
		 Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            session.beginTransaction();
	            session.save(client);
	            session.getTransaction().commit();
	            session.close();
	        } catch (Exception e) {
	            System.out.print("erreur d'ajout " + e.getMessage());
	            session.beginTransaction().rollback();
	        }
	 }
	
	 
	 
	 
	  public void deleteClient(Client client) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            session.beginTransaction();
	            session.delete(client);
	            session.getTransaction().commit();
	            session.close();
	        } catch (Exception e) {
	            System.out.print("erreur suppression " + e.getMessage());
	            session.beginTransaction().rollback();
	        }
	    }
	
	
	  
		 public void updateClient(Client client) {
			 
		        Session session = HibernateUtil.getSessionFactory().openSession();
		        try {
		            session.beginTransaction();
		            session.update(client);
		            session.getTransaction().commit();
		            session.close();
		            System.out.print("hotel bien ajouté");
		        } catch (Exception e) {
		            System.out.print("erreur mise a jour " + e.getMessage());
		        }
		    }

	
	

	 public Client getClientById(int id){
	
	  List list = getSessionFactory().getCurrentSession()
	
	           .createQuery("from Client where id=?")
	
	                 .setParameter(0, id).list();
	
	  return (Client)list.get(0);
	
	 }
	
	 public boolean verificationMotdepasseLogin(String login,String motdepasse){
		 System.out.println("pas de reponse");
		 System.out.println("pas de reponse"+" from User u where u.login='"+login+"' and u.password='"+motdepasse+"'");

			//Session session =HibernateUtil.getSessionFactory().openSession();
			 //System.out.println("pas de reponse"+" from User u where u.login='"+login+"' and u.password='"+motdepasse+"'");
      // Query q=session.createQuery(" from User u where u.login='"+login+"' and u.password='"+motdepasse+"'");
		Session s = (Session) HibernateUtil.getSessionFactory();
		 Transaction tx = (Transaction) s.beginTransaction();
		 Query q=s.createQuery("from User u  where u.login='oo' and u.password='jesuispalestine'");

		   List l=q.list();
		   if(l.isEmpty()){
		 
			   return false;

		   }else
		    	return true;
		  


		}
		   
		   
		 


	/*public String logout() {
        HttpSession session = SessionBean.getSession();
        session.invalidate();
        return "login";
    }*/

}
