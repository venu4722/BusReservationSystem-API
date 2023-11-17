package com.busapi.services;

import java.util.List;

import com.busapi.DTO.ReservationDTO;
import com.busapi.exceptions.AdminException;
import com.busapi.exceptions.BusException;
import com.busapi.exceptions.ReservationException;
import com.busapi.exceptions.UserException;
import com.busapi.models.Reservation;

public interface ReservationService {
	
	public Reservation addReservation(ReservationDTO reservationDTO, String key) throws ReservationException , BusException,UserException ;
		
	public Reservation deleteReservation(Integer reservationId, String key) throws ReservationException, BusException, UserException;
	
	public Reservation viewReservation(Integer reservationId,String key) throws ReservationException, AdminException;
	
	public List<Reservation> viewAllReservation(String key)throws ReservationException;
	
	public List<Reservation> viewReservationByUser(String key) throws ReservationException, UserException;
	
}
