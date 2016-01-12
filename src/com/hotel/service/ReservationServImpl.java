package com.hotel.service;

import java.util.List;

import com.hotel.beans.Hotel;
import com.hotel.beans.Reservation;
import com.hotel.dao.HotelDaoInterface;
import com.hotel.dao.ReservationDaoImplement;
import com.hotel.dao.ReservationDaoInterface;
import com.hotel.dao.hotelDaoImplement;

public class ReservationServImpl implements ReservationServInterface {
	 ReservationDaoInterface reservDao=new  ReservationDaoImplement() ;

	 
	public List<Reservation> getReservations(){
		List<Reservation> l=reservDao.getReservations();
		
		return l;
		}

	public Reservation findById(int id) {
		return reservDao.findById(id);
	}

	@Override
	public void deletReservation(Reservation Reservation) {
		// TODO Auto-generated method stub
		reservDao.deletReservation(Reservation);

	}
    public void updateReservation(Reservation Reservation){	 
    	reservDao.updateReservation(Reservation);
   	 }
}
