package com.bluebitsin.parkingweb.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QRData {

	@JsonProperty("is_qr_valid")
	private boolean qrValid;

	@JsonProperty("scan_qr_status")
	private int scanStatus;

	@JsonProperty("booking_id")
	private int bookingId;

	@JsonProperty("booking_timestamp")
	private Date timestamp;

	@JsonProperty("car_model")
	private String carModel;

	@JsonProperty("car_no")
	private String carNumber;

	@JsonProperty("scan_status_message")
	private String message;

	public QRData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isQrValid() {
		return qrValid;
	}

	public void setQrValid(boolean qrValid) {
		this.qrValid = qrValid;
	}

	public int getScanStatus() {
		return scanStatus;
	}

	public void setScanStatus(int scanStatus) {
		this.scanStatus = scanStatus;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "QRData [qrValid=" + qrValid + ", scanStatus=" + scanStatus + ", bookingId=" + bookingId + ", timestamp="
				+ timestamp + ", carModel=" + carModel + ", carNumber=" + carNumber + ", message=" + message + "]";
	}
	
}
