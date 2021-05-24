package com.bluebitsin.parkingweb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	@JsonProperty("user_id")
	private int userId;
	
	@JsonProperty("user_name")
	private String userName;
	
	@JsonProperty("vechile_number")
	private String vechileNumber;
	
	@JsonProperty("vechile_model")
	private String vechileModel;
	
	@JsonProperty("mobile_number")
	private String mobileNumber;
	
	@JsonProperty("password")
	private String password;


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getVechileNumber() {
		return vechileNumber;
	}

	public void setVechileNumber(String vechileNumber) {
		this.vechileNumber = vechileNumber;
	}

	public String getVechileModel() {
		return vechileModel;
	}

	public void setVechileModel(String vechileModel) {
		this.vechileModel = vechileModel;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", vechileNumber=" + vechileNumber
				+ ", vechileModel=" + vechileModel + ", mobileNumber=" + mobileNumber + ", password=" + password + "]";
	}
	
}
