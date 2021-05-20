package com.bluebitsin.parkingweb.model;

import java.util.Date;

public class ParkingTicket {

	private String reservationId;
	private Date date;
	private String location;
	private int slotNumber;
	private int floor;
	private char wing;
	
	
	public ParkingTicket() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getReservationId() {
		return reservationId;
	}


	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getSlotNumber() {
		return slotNumber;
	}


	public void setSlotNumber(int slotNumber) {
		this.slotNumber = slotNumber;
	}


	public int getFloor() {
		return floor;
	}


	public void setFloor(int floor) {
		this.floor = floor;
	}


	public char getWing() {
		return wing;
	}


	public void setWing(char wing) {
		this.wing = wing;
	}


	@Override
	public String toString() {
		return "ParkingTicket [reservationId=" + reservationId + ", date=" + date + ", location=" + location
				+ ", slotNumber=" + slotNumber + ", floor=" + floor + ", wing=" + wing + "]";
	}
	
	
	
	
}
