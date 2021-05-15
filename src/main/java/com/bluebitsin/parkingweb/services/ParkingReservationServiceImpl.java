package com.bluebitsin.parkingweb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluebitsin.parkingweb.dao.ParkingReservationDao;

@Service
public class ParkingReservationServiceImpl {
	
	@Autowired
	private ParkingReservationDao parkingReservationDao;

	public ParkingReservationServiceImpl() {
		super();
	}
	
	

}
