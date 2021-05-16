package com.bluebitsin.parkingweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bluebitsin.parkingweb.model.ParkingReservation;

@Repository
public interface ParkingReservationDao extends JpaRepository<ParkingReservation, Integer> {

}
