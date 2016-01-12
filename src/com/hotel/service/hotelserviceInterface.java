package com.hotel.service;

import java.util.List;

import com.hotel.beans.Hotel;

public interface hotelserviceInterface {
	 public List<Hotel> getHotels();
	 public Hotel findById(int id);
	 public void deleteOneHotel(Hotel hotel);
	 public void updateHotel(Hotel hotel);
	  public void addHotel(Hotel hotel);

}
