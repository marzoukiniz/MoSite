package com.hotel.service;

import java.util.List;

import com.hotel.beans.Hotel;
import com.hotel.dao.HotelDaoInterface;
import com.hotel.dao.hotelDaoImplement;

public class hotelServiceImplement implements hotelserviceInterface{
	
	 HotelDaoInterface hoteldaoimpl=new  hotelDaoImplement() ;

	@Override
	public List<Hotel> getHotels() {
		
		List<Hotel>l=hoteldaoimpl.getHotels();
		return l;
	}

	@Override
	public Hotel findById(int id) {
		return hoteldaoimpl.findById(id);
	}
	public void deleteOneHotel (Hotel hotel){
		hoteldaoimpl.deletHotel(hotel);
		
	}
	 public void updateHotel(Hotel hotel){
		 hoteldaoimpl.updateHotel(hotel);
	 }
	 
	   public void addHotel(Hotel hotel){
		   hoteldaoimpl.addHotel(hotel);
	   }


}
