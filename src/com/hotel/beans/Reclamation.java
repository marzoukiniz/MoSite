package com.hotel.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Reclamation")
public class Reclamation {
	@Id
    @GeneratedValue
    
	private int idReclamation;
	
	private String objet;
	private String message;
	private String date;
	
	 @ManyToOne(targetEntity=com.hotel.beans.Client.class)
	    @JoinColumn(name="id")
	    private Client client;
	
	 
	 
	public Reclamation() {
		
	}
  public int getIdReclamation() {
		return idReclamation;
	}
	
	
	public Client getIDclient() {
		return client;
	}

	

	public String getObjet() {
		return objet;
	}
	public String getMessage() {
		return message;
	}
	public String getDate() {
		return date;
	}
	public void setIdReclamation(int idReclamation) {
		this.idReclamation = idReclamation;
	}
	
	public void setObjet(String objet) {
		this.objet = objet;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	
}