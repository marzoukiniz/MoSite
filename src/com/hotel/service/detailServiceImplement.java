package com.hotel.service;

import java.util.List;


import com.hotel.beans.HotelDetail;

import com.hotel.dao.detailDaoImplement;
import com.hotel.dao.detailDaoInterface;


public class detailServiceImplement implements detailServiceInterface {
	detailDaoInterface detaildaointerface=new detailDaoImplement(); 

	@Override
	public List<HotelDetail> getDetailHotels(int id) {
		
		return detaildaointerface.getDetailHotels(id);
	}
	
}
