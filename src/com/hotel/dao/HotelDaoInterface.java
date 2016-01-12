package com.hotel.dao;

import java.util.List;

import com.hotel.beans.Client;
import com.hotel.beans.Hotel;

public interface HotelDaoInterface {
	
	public List<Hotel> getHotels();
	
	public Hotel findById(int id);
	
	public void Update(int id,int nombrechambre);
    public void deletHotel(Hotel hotel);
    public void updateHotel(Hotel hotel);
   public void addHotel(Hotel hotel);
}
