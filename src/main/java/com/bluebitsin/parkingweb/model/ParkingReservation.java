package com.bluebitsin.parkingweb.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

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
	
	@Column(name="reservation_timestamp")
	private long reservationTimestamp;
	
	@Column(name="dutation_in_minuits")
	private int durationInMinuits;

	@Column(name="booking_date")
	private Date date;
	
	@Column(name="parking_slot_id")
	private int parkingSlotId;
	
	@Column(name="reservation_status")
	private int reservationStatus;
	
	@Transient
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

	public ParkingReservation(int id, String reservationId, int customerId, long reservationTimestamp,
			int durationInMinuits, Date date, int parkingSlotId, int reservationStatus) {
		super();
		this.id = id;
		this.reservationId = reservationId;
		this.customerId = customerId;
		this.reservationTimestamp = reservationTimestamp;
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

	public long getReservationTimestamp() {
		return reservationTimestamp;
	}

	public void setReservationTimestamp(long reservationTimestamp) {
		this.reservationTimestamp = reservationTimestamp;
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
				+ ", reservationTimestamp=" + reservationTimestamp + ", durationInMinuits=" + durationInMinuits
				+ ", date=" + date + ", parkingSlotId=" + parkingSlotId + ", reservationStatus=" + reservationStatus
				+ "]";
	}
	
	
}
