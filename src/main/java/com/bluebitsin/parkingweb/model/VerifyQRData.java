package com.bluebitsin.parkingweb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VerifyQRData {

	@JsonProperty("response_status")
	private boolean responseStatus;
	
	@JsonProperty("response_code")
	private int responseCode;
	
	@JsonProperty("qr_data")
	private QRData qrData;

	public VerifyQRData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(boolean responseStatus) {
		this.responseStatus = responseStatus;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public QRData getQrData() {
		return qrData;
	}

	public void setQrData(QRData qrData) {
		this.qrData = qrData;
	}

	@Override
	public String toString() {
		return "VerifyQRData [responseStatus=" + responseStatus + ", responseCode=" + responseCode + ", qrData="
				+ qrData + "]";
	}
	
}
