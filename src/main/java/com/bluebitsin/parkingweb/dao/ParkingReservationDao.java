package com.bluebitsin.parkingweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bluebitsin.parkingweb.model.ParkingReservation;

public interface ParkingReservationDao extends JpaRepository<ParkingReservation, Integer> {

}
