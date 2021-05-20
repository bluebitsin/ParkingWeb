package com.bluebitsin.parkingweb.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "parking_slot_reservation")
public class ParkingReservation {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="reservation_id")
	private String reservationId;
	
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="dutation_in_minuits")
	private int durationInMinuits;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="booking_date")
	private Date date;
	
	@Column(name="parking_slot_id")
	private int parkingSlotId;
	
	@Column(name="reservation_status")
	private int reservationStatus;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "parkingReservation")
	private ParkingSlip parkingSlip;
	
	
	public ParkingSlip getParkingSlip() {
		return parkingSlip;
	}

	public void setParkingSlip(ParkingSlip parkingSlip) {
		this.parkingSlip = parkingSlip;
	}

	public ParkingReservation() {
		super();
	}

	public ParkingReservation(int id, String reservationId, int customerId,
			int durationInMinuits, Date date, int parkingSlotId, int reservationStatus) {
		super();
		this.id = id;
		this.reservationId = reservationId;
		this.customerId = customerId;
		this.durationInMinuits = durationInMinuits;
		this.date = date;
		this.parkingSlotId = parkingSlotId;
		this.reservationStatus = reservationStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReservationId() {
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getDurationInMinuits() {
		return durationInMinuits;
	}

	public void setDurationInMinuits(int durationInMinuits) {
		this.durationInMinuits = durationInMinuits;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getParkingSlotId() {
		return parkingSlotId;
	}

	public void setParkingSlotId(int parkingSlotId) {
		this.parkingSlotId = parkingSlotId;
	}

	public int getReservationStatus() {
		return reservationStatus;
	}

	public void setReservationStatus(int reservationStatus) {
		this.reservationStatus = reservationStatus;
	}

	@Override
	public String toString() {
		return "ParkingReservation [id=" + id + ", reservationId=" + reservationId + ", customerId=" + customerId
				+  ", durationInMinuits=" + durationInMinuits
				+ ", date=" + date + ", parkingSlotId=" + parkingSlotId + ", reservationStatus=" + reservationStatus
				+ "]";
	}
	
	
}
