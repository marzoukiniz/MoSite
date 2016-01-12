package com.hotel.service;

import java.util.List;

import com.hotel.beans.Reservation;

public interface ReservationServInterface {
	public List<Reservation> getReservations();
	public Reservation findById(int id);
    public void deletReservation(Reservation Reservation);
    public void updateReservation(Reservation Reservation);
}
