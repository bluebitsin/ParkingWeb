package com.bluebitsin.parkingweb.services;

import com.bluebitsin.parkingweb.model.Customer;
import com.bluebitsin.parkingweb.model.ParkingTicket;
import com.bluebitsin.parkingweb.model.QRData;
import com.bluebitsin.parkingweb.model.VerifyQRData;

public interface ParkingReservationService {

	public ParkingTicket addParkingReservation(Customer customer);
	public VerifyQRData verifyParkingTicket(String reservationId);
	
}
