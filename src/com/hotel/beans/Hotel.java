package com.hotel.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel {
	@Id
    @Column(name="IdHotel")
    @GeneratedValue	
	private int IdHotel;
	private String nomHotel;
	private int gradhotel;
	private Double prixhotel;
	private String imaghot;
	private int NbrChambres;
	
	@OneToOne(mappedBy="hotels", cascade=CascadeType.ALL)
    private HotelDetail hoteldetails;
	
	
	
	
	@OneToMany(mappedBy="hotel", cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval=true)
	private Set <Paiement> payements ;
	
	@OneToMany(mappedBy="hotel", cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval=true)
	private Set <Reservation> reservations ;
	
	
	//@OneToMany(mappedBy="hotelp", cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval=true)
	//private Set <Panier> paniers ;
	
	
	@ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="HotelOffre", 
                joinColumns={@JoinColumn(name="IdHotel")}, 
                inverseJoinColumns={@JoinColumn(name="idoffre")})
    private Set<Offre> offres = new HashSet<Offre>();
	
	
	
	
	
	public int getNbrChambres() {
		return NbrChambres;
	}


	public void setNbrChambres(int nbrChambres) {
		NbrChambres = nbrChambres;
	}


	public Set<Offre> getOffres() {
		return offres;
	}


	public void setOffres(Set<Offre> offres) {
		this.offres = offres;
	}


	public Hotel() {
		super();
	}
	
	
	public String getImaghot() {
		return imaghot;
	}


	public void setImaghot(String imaghot) {
		this.imaghot = imaghot;
	}


	public HotelDetail getHoteldetails() {
		return hoteldetails;
	}


	public void setHoteldetails(HotelDetail hoteldetails) {
		this.hoteldetails = hoteldetails;
	}


	public Set<Paiement> getPayements() {
		return payements;
	}


	public void setPayements(Set<Paiement> payements) {
		this.payements = payements;
	}


	public Set<Reservation> getReservations() {
		return reservations;
	}


	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}


	


	public int getIdHotel() {
		return IdHotel;
	}
	
	public void setIdHotel(int idHotel) {
		IdHotel = idHotel;
	}
	
	
	

	public String getNomHotel() {
		return nomHotel;
	}
	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}
	public int getGradhotel() {
		return gradhotel;
	}
	public void setGradhotel(int gradhotel) {
		this.gradhotel = gradhotel;
	}
	public Double getPrixhotel() {
		return prixhotel;
	}
	public void setPrixhotel(double d) {
		this.prixhotel = (double) d;
	}


	public Hotel(int idHotel, String nomHotel, int gradhotel, Double prixhotel,
			String imaghot, int nbrChambres, HotelDetail hoteldetails,
			Set<Paiement> payements, Set<Reservation> reservations,
			Set<Offre> offres) {
		super();
		IdHotel = idHotel;
		this.nomHotel = nomHotel;
		this.gradhotel = gradhotel;
		this.prixhotel = prixhotel;
		this.imaghot = imaghot;
		NbrChambres = nbrChambres;
		this.hoteldetails = hoteldetails;
		this.payements = payements;
		this.reservations = reservations;
		this.offres = offres;
	}
	
	
	
	
	
	
	}
