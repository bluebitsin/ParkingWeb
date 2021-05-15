package com.bluebitsin.parkingweb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluebitsin.parkingweb.dao.ParkingReservationDao;
import com.bluebitsin.parkingweb.model.Customer;
import com.bluebitsin.parkingweb.model.ParkingTicket;

@Service
public class ParkingReservationServiceImpl implements ParkingReservationService {
	
	@Autowired
	private ParkingReservationDao parkingReservationDao;

	public ParkingReservationServiceImpl() {
		super();
	}

	@Override
	public ParkingTicket addParkingReservation(Customer customer) {
		// 
		parkingReservationDao.save(null);
		return null;
	}
	
	

}
