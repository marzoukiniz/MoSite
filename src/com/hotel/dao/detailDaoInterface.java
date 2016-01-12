package com.hotel.dao;

import java.util.List;


import com.hotel.beans.HotelDetail;

public interface detailDaoInterface {
	
	public List<HotelDetail> getDetailHotels(int id);

}
