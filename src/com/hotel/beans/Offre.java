package com.hotel.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import java.util.HashSet;

import javax.persistence.*;


@Entity
@Table(name="offre")
public class Offre implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private int idoffre;
	private String titre;
	private String description;
	private Date date;
	
	private String imgoffre;
	
	
	@ManyToMany(mappedBy="offres")
    private Set<Hotel> hotels = new HashSet<Hotel>();
	
	
	public Offre() {
		super();
	}
	
	
	
	public String getImgoffre() {
		return imgoffre;
	}



	public void setImgoffre(String imgoffre) {
		this.imgoffre = imgoffre;
	}



	public Set<Hotel> getHotels() {
		return hotels;
	}



	public void setHotels(Set<Hotel> hotels) {
		this.hotels = hotels;
	}



	public int getIdoffre() {
		return idoffre;
	}

	public void setIdoffre(int idoffre) {
		this.idoffre = idoffre;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
