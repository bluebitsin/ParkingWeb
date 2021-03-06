package com.bluebitsin.parkingweb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "parking_slip")
public class ParkingSlip {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@OneToOne
	@JoinColumn(name = "pr_id", nullable = false)
	private ParkingReservation parkingReservation;

	@Column(name = "reservation_id")
	private String reservationId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "actual_entry_time")
	private Date actualEntryTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "actual_exit_time")
	private Date actualExitTime;

	@Column(name = "basic_cost")
	private float basicCost;

	@Column(name = "penalty")
	private float penalty;

	@Column(name = "check_out_agent_id")
	private String checkoutAgentId;

	@Column(name = "check_in_agent_id")
	private String checkInAgentId;

	@Column(name = "scan_status")
	private int scanStatus;

	public ParkingSlip() {
		super();
	}

	public ParkingSlip(int id, ParkingReservation parkingReservation, String reservationId, Date actualEntryTime,
			Date actualExitTime, float basicCost, float penalty, String checkoutAgentId, String checkInAgentId,
			int scanStatus) {
		super();
		this.id = id;
		this.parkingReservation = parkingReservation;
		this.reservationId = reservationId;
		this.actualEntryTime = actualEntryTime;
		this.actualExitTime = actualExitTime;
		this.basicCost = basicCost;
		this.penalty = penalty;
		this.checkoutAgentId = checkoutAgentId;
		this.checkInAgentId = checkInAgentId;
		this.scanStatus = scanStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ParkingReservation getParkingReservation() {
		return parkingReservation;
	}

	public void setParkingReservation(ParkingReservation parkingReservation) {
		this.parkingReservation = parkingReservation;
	}

	public String getReservationId() {
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public Date getActualEntryTime() {
		return actualEntryTime;
	}

	public void setActualEntryTime(Date actualEntryTime) {
		this.actualEntryTime = actualEntryTime;
	}

	public Date getActualExitTime() {
		return actualExitTime;
	}

	public void setActualExitTime(Date actualExitTime) {
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

	public String getCheckoutAgentId() {
		return checkoutAgentId;
	}

	public void setCheckoutAgentId(String checkoutAgentId) {
		this.checkoutAgentId = checkoutAgentId;
	}

	public String getCheckInAgentId() {
		return checkInAgentId;
	}

	public void setCheckInAgentId(String checkInAgentId) {
		this.checkInAgentId = checkInAgentId;
	}

	public int getScanStatus() {
		return scanStatus;
	}

	public void setScanStatus(int scanStatus) {
		this.scanStatus = scanStatus;
	}

	@Override
	public String toString() {
		return "ParkingSlip [id=" + id + ", parkingReservation=" + parkingReservation + ", reservationId="
				+ reservationId + ", actualEntryTime=" + actualEntryTime + ", actualExitTime=" + actualExitTime
				+ ", basicCost=" + basicCost + ", penalty=" + penalty + ", checkoutAgentId=" + checkoutAgentId
				+ ", checkInAgentId=" + checkInAgentId + ", scanStatus=" + scanStatus + "]";
	}

}
