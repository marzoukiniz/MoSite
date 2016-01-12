package com.hotel.beans;

import javax.persistence.*;
import javax.persistence.GeneratedValue;


import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Paiement {
	@Id
    @GeneratedValue
	private int idpay;
	private int Quantite;
	private int Prix;
	
	 @ManyToOne(targetEntity=com.hotel.beans.Client.class)
	    @JoinColumn(name="id")
	    private Client client;
	 
	 
	 @ManyToOne(targetEntity=com.hotel.beans.Hotel.class)
	    @JoinColumn(name="IdHotel")
	    private Hotel hotel;
	 
	/* @ManyToMany(cascade = {CascadeType.ALL})
	    @JoinTable(name="EMPLOYEE_MEETING", 
	                joinColumns={@JoinColumn(name="EMPLOYEE_ID")}, 
	                inverseJoinColumns={@JoinColumn(name="MEETING_ID")}) */
	 
	
	public Paiement() {
		super();
	}
	public int getId() {
		return idpay;
	}
	public void setId(int id) {
		this.idpay = id;
	}
	public int getQuantite() {
		return Quantite;
	}
	public void setQuantite(int quantite) {
		Quantite = quantite;
	}
	public int getPrix() {
		return Prix;
	}
	public void setPrix(int prix) {
		Prix = prix;
	}
	  
	
	
	
	
}
