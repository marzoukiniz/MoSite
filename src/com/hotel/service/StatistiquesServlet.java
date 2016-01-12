package com.hotel.service;

import java.math.BigDecimal;

public interface StatistiquesServlet {
	
	public int statClients();
	public int statClientReservation();
	public BigDecimal statNombreReservation();

}
