package com.bluebitsin.parkingweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="parking_slip")
public class ParkingSlip {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Transient
	private ParkingReservation parkingReservation;
	
	@Column(name="reservation_id")
	private long reservationId;
	
	@Column(name="actual_entry_time")
	private long actualEntryTime;
	
	@Column(name="actual_exit_time")
	private long actualExitTime;
	
	@Column(name="basic_cost")
	private float basicCost;
	
	@Column(name="penalty")
	private float penalty;
	
	@Column(name="total_cost")
	private float totalCost;
	
	@Column(name="is_paid")
	private int isPaid;
	
	@Column(name="scan_status")
	private int scanStatus;

	
	public ParkingSlip() {
		super();
	}


	public ParkingSlip(int id, long reservationId, long actualEntryTime, long actualExitTime, float basicCost,
			float penalty, float totalCost, int isPaid, int scanStatus) {
		super();
		this.id = id;
		this.reservationId = reservationId;
		this.actualEntryTime = actualEntryTime;
		this.actualExitTime = actualExitTime;
		this.basicCost = basicCost;
		this.penalty = penalty;
		this.totalCost = totalCost;
		this.isPaid = isPaid;
		this.scanStatus = scanStatus;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public long getReservationId() {
		return reservationId;
	}


	public void setReservationId(long reservationId) {
		this.reservationId = reservationId;
	}


	public long getActualEntryTime() {
		return actualEntryTime;
	}


	public void setActualEntryTime(long actualEntryTime) {
		this.actualEntryTime = actualEntryTime;
	}


	public long getActualExitTime() {
		return actualExitTime;
	}


	public void setActualExitTime(long actualExitTime) {
		this.actualExitTime = actualExitTime;
	}


	public float getBasicCost() {
		return basicCost;
	}


	public void setBasicCost(float basicCost) {
		this.basicCost = basicCost;
	}


	public float getPenalty() {
		return penalty;
	}


	public void setPenalty(float penalty) {
		this.penalty = penalty;
	}


	public float getTotalCost() {
		return totalCost;
	}


	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}


	public int getIsPaid() {
		return isPaid;
	}


	public void setIsPaid(int isPaid) {
		this.isPaid = isPaid;
	}


	public int getScanStatus() {
		return scanStatus;
	}


	public void setScanStatus(int scanStatus) {
		this.scanStatus = scanStatus;
	}


	@Override
	public String toString() {
		return "ParkingSlip [id=" + id + ", reservationId=" + reservationId + ", actualEntryTime=" + actualEntryTime
				+ ", actualExitTime=" + actualExitTime + ", basicCost=" + basicCost + ", penalty=" + penalty
				+ ", totalCost=" + totalCost + ", isPaid=" + isPaid + ", scanStatus=" + scanStatus + "]";
	}
	
	
}
