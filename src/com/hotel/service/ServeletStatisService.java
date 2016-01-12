package com.hotel.service;

import java.math.BigDecimal;

import com.hotel.dao.statistiqueimplementDao;

public class ServeletStatisService implements StatistiquesServlet {
	statistiqueimplementDao  statis=new statistiqueimplementDao();
	

	@Override
	public int statClients() {
		return statis.statClients();
		
	}

	@Override
	public int statClientReservation() {
		// TODO Auto-generated method stub
		return statis.statClientReservation();
	}

	@Override
	public BigDecimal statNombreReservation() {
		// TODO Auto-generated method stub
		return statis.statNombreReservation();
	}
	

}
