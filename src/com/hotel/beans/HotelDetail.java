package com.hotel.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="hoteldetail")
public class HotelDetail {
	@Id
    @Column(name="IdHotel", unique=true, nullable=false)
	@GeneratedValue(generator = "gen")
    @GenericGenerator(name = "gen", strategy ="foreign", 
	parameters = @Parameter(name = "property", value ="hotels"))
	private int IdHotel;
	
	@OneToOne
    @PrimaryKeyJoinColumn
    private Hotel hotels;
	
	
	private String villehot;
	private String adresse;
	private String description;
	private int NbrChambres;
	
	
	
	
	public HotelDetail() {
		
	}


	public HotelDetail(String villehot, String adresse, String description, int nbrChambres) {
		super();
		this.villehot = villehot;
		this.adresse = adresse;
		this.description = description;
		NbrChambres = nbrChambres;
	}

	
	public int getIdHotel() {
		return IdHotel;
	}


	public void setIdHotel(int idHotel) {
		IdHotel = idHotel;
	}


	public Hotel getHotels() {
		return hotels;
	}

	 
	public void setHotels(Hotel hotels) {
		this.hotels = hotels;
		this.IdHotel = hotels.getIdHotel();
		   
		
	}


	public String getVillehot() {
		return villehot;
	}
	
	
	public void setVillehot(String villehot) {
		this.villehot = villehot;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNbrChambres() {
		return NbrChambres;
	}
	public void setNbrChambres(int nbrChambres) {
		NbrChambres = nbrChambres;
	}
	

}
