package com.hotel.beans;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private Integer id;
	private Integer cin;
	private String nom;
	private String prenom;
	private String password;
	private String login;
	private String email;

	public User() {
		super();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCin() {
		return cin;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getPassword() {
		return password;
	}
	public String getLogin() {
		return login;
	}
	public String getEmail() {
		return email;
	}
	
	public void setCin(Integer cin) {
		this.cin = cin;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
