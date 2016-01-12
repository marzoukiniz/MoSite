package com.hotel.beans;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="HotelOffre")
public class HotelOffre {
	@Id
	
	private int idoffre;
	private String titre;
	private String description;
	private Date date;
	private String imgoffre;
	
	
	
  public HotelOffre() {
		super();
		
	}
public HotelOffre(String titre, String description, Date date, String imgoffre) {
		super();
		this.titre = titre;
		this.description = description;
		this.date = date;
		this.imgoffre = imgoffre;
	}
public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImgoffre() {
		return imgoffre;
	}
	public void setImgoffre(String imgoffre) {
		this.imgoffre = imgoffre;
	}
	
	
	
	

}
