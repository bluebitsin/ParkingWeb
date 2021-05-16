package com.bluebitsin.parkingweb.services;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluebitsin.parkingweb.dao.ParkingReservationDao;
import com.bluebitsin.parkingweb.model.Customer;
import com.bluebitsin.parkingweb.model.ParkingReservation;
import com.bluebitsin.parkingweb.model.ParkingSlip;
import com.bluebitsin.parkingweb.model.ParkingTicket;

import helper.Utility;

@Service
public class ParkingReservationServiceImpl implements ParkingReservationService {
	
	@Autowired
	private ParkingReservationDao parkingReservationDao;

	public ParkingReservationServiceImpl() {
		super();
	}

	@Override
	public ParkingTicket addParkingReservation(Customer customer) {
		// Create Booking
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
		ParkingReservation parkingReservation = new ParkingReservation();
		parkingReservation.setCustomerId(customer.getCustomerId());
		parkingReservation.setReservationTimestamp(timestamp.getTime());
		parkingReservation.setDate(new Date());
		parkingReservation.setDurationInMinuits(0);
		parkingReservation.setParkingSlotId(1); // find on availablity basis
		parkingReservation.setReservationStatus(0);
		parkingReservation.setReservationId(Utility.generateRandomStringByUUID()); //UUID
		
		ParkingSlip slip = new ParkingSlip();
		slip.setActualEntryTime(0);
		slip.setActualExitTime(0);
		slip.setBasicCost(50);
		slip.setIsPaid(0);
		slip.setPenalty(0);
		slip.setReservationId(parkingReservation);
		
		
		parkingReservationDao.save(new ParkingReservation());
		return null;
	}
	
	

}
