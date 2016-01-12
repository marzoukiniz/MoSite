package com.hotel.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import com.hotel.beans.Reclamation;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Client extends User{
	
	private String statut;
	private String niveau;
	
	@OneToMany(mappedBy="client", cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval=true)
	private Set <Reclamation> reclamations ;
	
	@OneToMany(mappedBy="client", cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval=true)
	private Set <Reservation> reservations ;
	
	@OneToMany(mappedBy="client", cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval=true)
	private Set <Paiement> payements ;
	
	/*@ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="reservation", 
                joinColumns={@JoinColumn(name="id")}, 
                inverseJoinColumns={@JoinColumn(name="IdHotel")})
    private Set<Hotel> hotels = new HashSet<Hotel>();*/
	
	
   public Client(){
		
	}



public String getStatut() {
	return statut;
}



public void setStatut(String statut) {
	this.statut = statut;
}



public String getNiveau() {
	return niveau;
}



public void setNiveau(String niveau) {
	this.niveau = niveau;
}
	
   
	
	
	
	
	
	
}
