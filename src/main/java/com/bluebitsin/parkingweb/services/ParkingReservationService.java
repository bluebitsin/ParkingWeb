package com.bluebitsin.parkingweb.services;

import com.bluebitsin.parkingweb.model.Customer;
import com.bluebitsin.parkingweb.model.ParkingTicket;

public interface ParkingReservationService {

	public ParkingTicket addParkingReservation(Customer customer);
}
