package com.hotel.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.hotel.beans.*;
import com.hotel.persistancce.HibernateUtil;

public class TestClientReclamation {

	
	


		    public static void main(String[] args) {
		 
		        SessionFactory sf = HibernateUtil.getSessionFactory();
		        Session session = sf.openSession();
		        session.beginTransaction();
		        Reclamation reclamation=new Reclamation();
		        Client client = new Client();
		        
		        client.setCin(8745275);;
			    client.setEmail("khalilriahi001@gmail.com");
			    client.setLogin("khalil.riahi");
			    client.setPassword("jesuispalestine");
			    client.setStatut("travaillé");
			    client.setNom("khalil");
			    client.setPrenom("riahi");
			    client.setNiveau("bac+3");
			    
			    session.save(client);
		       
		        reclamation.setDate("2015-8-9");
		        reclamation.setMessage("vos services sont tés mauvaises");
		        reclamation.setObjet("Services");
		        reclamation.setClient(client);
		        session.save(client);
                session.save(reclamation);
		         
		        
		 
		        session.getTransaction().commit();
		        session.close();
		    }
		
	   
}
