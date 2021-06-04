package com.bluebitsin.parkingweb.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bluebitsin.parkingweb.model.Customer;
import com.bluebitsin.parkingweb.model.ParkingSlot;
import com.bluebitsin.parkingweb.model.ParkingTicket;
import com.bluebitsin.parkingweb.model.RequestCheckStatus;
import com.bluebitsin.parkingweb.model.VerifyQRData;

public interface ParkingReservationService {

	public ParkingTicket addParkingReservation(Customer customer);
	public VerifyQRData verifyParkingTicket(String reservationId);
	public ResponseEntity<HttpStatus> updateCheckStatus(RequestCheckStatus checkStatus);
	public List<ParkingTicket> getAllParkingReservation(int customerId);
	public boolean closeGate(int gateStatus);
	public List<ParkingSlot> getParkingSlots(int customerId);
	
}
