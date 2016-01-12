package com.hotel.beans;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Administrateur extends User {

	
	private String post;
	private String role;
	
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
