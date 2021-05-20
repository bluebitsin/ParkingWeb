package com.bluebitsin.parkingweb.services;

import com.bluebitsin.parkingweb.model.Customer;
import com.bluebitsin.parkingweb.model.ParkingTicket;
import com.bluebitsin.parkingweb.model.QRData;

public interface ParkingReservationService {

	public ParkingTicket addParkingReservation(Customer customer);
	public QRData verifyParkingTicket(String reservationId);
	
}
