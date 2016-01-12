package com.hotel.beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="reservation")

public class Reservation {
	 @Id
     @GeneratedValue
      private int idreser;
	
	  private String debutreserv;
	
	  private String finreserv;
	  private int nbCh;
	  
	  
	  public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@ManyToOne(targetEntity=com.hotel.beans.Client.class)
	    @JoinColumn(name="id")
	    private Client client;
	  
	  @ManyToOne(targetEntity=com.hotel.beans.Hotel.class)
	    @JoinColumn(name="IdHotel")
	    private Hotel hotel;
	 
	  
	public Reservation() {
		super();
	}

	public String getDebutreserv() {
		return debutreserv;
	}
	public void setDebutreserv(String debutreserv) {
		this.debutreserv = debutreserv;
	}
	public String getFinreserv() {
		return finreserv;
	}
	public void setFinreserv(String finreserv) {
		this.finreserv = finreserv;
	}
	public int getNbCh() {
		return nbCh;
	}
	public void setNbCh(int nbCh) {
		this.nbCh = nbCh;
	}

	public int getIdreser() {
		return idreser;
	}

	public void setIdreser(int idreser) {
		this.idreser = idreser;
	}
	  

}
