package com.bluebitsin.parkingweb.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestCheckStatus {

	@JsonProperty("check_status")
	private int checkStatus;

	@JsonProperty("agent_id")
	private String agentId;

	@JsonProperty("timestamp")
	private Date timestamp;

	@JsonProperty("customer_id")
	private int customerId;

	@JsonProperty("booking_id")
	private int bookingId;

	@JsonProperty("reservation_id")
	private String reservationId;

	public RequestCheckStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(int checkStatus) {
		this.checkStatus = checkStatus;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getReservationId() {
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	@Override
	public String toString() {
		return "RequestCheckStatus [checkStatus=" + checkStatus + ", agentId=" + agentId + ", timestamp=" + timestamp
				+ ", customerId=" + customerId + ", bookingId=" + bookingId + ", reservationId=" + reservationId + "]";
	}

}
