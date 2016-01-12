package com.hotel.dao;

import java.util.List;

import com.hotel.beans.Hotel;
import com.hotel.beans.Reservation;

public interface ReservationDaoInterface {
	public List<Reservation> getReservations();
	public Reservation findById(int id);
    public void deletReservation(Reservation Reservation);
    public void updateReservation(Reservation Reservation);

}
