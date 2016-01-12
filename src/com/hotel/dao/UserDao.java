package com.hotel.dao;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;

import com.hotel.beans.Client;
import com.hotel.beans.User;
import com.hotel.persistancce.HibernateUtil;

public class UserDao  {
 
    public void addClient(Client client) {
 
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(client);
            session.getTransaction().commit();
            session.close(); 
            System.out.print("bien ajouté");
        } catch (Exception e) {
            System.out.print("erreur insertion " + e.getMessage());
        }
    }
     
    public void updateClient(Client client) {
 
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(client);
            session.getTransaction().commit();
            session.close();
            System.out.print("bien ajouté");
        } catch (Exception e) {
            System.out.print("erreur mise a jour " + e.getMessage());
        }
    }
 
    public void deletClient(Client client) {
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
 

    public Client getClient(long idincrementel) {
 
        Client client = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            client = (Client) session.get(Client.class, idincrementel);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.print("erreur  " + e.getMessage());
            session.beginTransaction().rollback();
            return client;
        }
        return client;
    }
 

    public List<Client> getListClient() {
        List<Client> listClient = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            listClient = session.createQuery("from Client").list();
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.print("erreur Select all " + e.getMessage());
            session.beginTransaction().rollback();
            return listClient;
           
        }
        return listClient;
    }

 // logiiiiiiiiiiiiiiiiiiiiiiiiiin debut
    
    public static boolean login(String user, String pass) {
        List<User> listClient = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Query query=session.createQuery("from User u where u.login = :user and u.password = :pass");
            query.setString("user", user);
            query.setString("pass", pass);
      
            listClient = query.list();
            session.getTransaction().commit();
           
            if(query.uniqueResult()!=null){
            	return true;
            
          //  session.setAttribute("name",query.list().NOM);
            
            }
            
            else {
                return false;
            }
         
        } catch (Exception e) {
            System.out.print("error connect : " + e.getMessage());
           // session.beginTransaction().rollback();
            return false;
        } finally{
        	 session.close();
        }
		
       
    }
    
    // logiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin fin
    
    public  List<Client> getClientOneClass(String idenelev , String codeetab) {
        List<Client> listClient = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Query query=session.createQuery("from Client u where u.codeetab = :codeetab and u.idenelev = :idenelev");
            query.setString("codeetab",codeetab);
            query.setString("idenelev",idenelev);
            listClient = query.list();
            session.getTransaction().commit();
           
            return listClient ;
  
        } catch (Exception e) {
            System.out.print("error get client : " + e.getMessage());
            session.beginTransaction().rollback();
            return listClient;
        } finally{
        	 session.close();
        }
		
       
    }
    
    // select from one etab
    public  List<Client> getClientOneEtab( String codeetab) {
        List<Client> listClient = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            Query query=session.createQuery("from Client u where u.codeetab = :codeetab");
            query.setString("codeetab",codeetab);
            listClient = query.list();
            session.getTransaction().commit();
           
            return listClient ;
  
        } catch (Exception e) {
            System.out.print("error get client : " + e.getMessage());
            session.beginTransaction().rollback();
            return listClient;
        } finally{
        	 session.close();
        }
		
       
    }
    
    public List<Client> getClientOne(String codepermanent) {
    	List<Client> listClient = null;
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	try {
    	session.beginTransaction();
    	Query query=session.createQuery("from Client u where u.codepermanent = :codepermanent");
    	query.setString("codepermanent",codepermanent);
    	listClient = query.list();
    	session.getTransaction().commit();

    	return listClient ;

    	} catch (Exception e) {
    	System.out.print("error get client : " + e.getMessage());
    	session.beginTransaction().rollback();
    	return listClient;
    	} finally{
    	session.close();
    	}


    	}

}