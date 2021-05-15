package com.bluebitsin.parkingweb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int customerId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "vehicle_number")
	private String vehicleNumber;
	
	@Column(name = "vehicle_model")
	private String vehicleModel;
	
	@Column(name = "vehicle_registration_date")
	private Date vehicleRegistrationDate;
	
	@Column(name = "is_regular_customer")
	private boolean isRegularCustomer;
	
	@Column(name = "contact_number")
	private int contactNumber;

	public Customer() {
		super();
	}
	
	public Customer(int customerId, String name, String vehicleNumber, String vehicleModel,
			Date vehicleRegistrationDate, boolean isRegularCustomer, int contactNumber) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.vehicleNumber = vehicleNumber;
		this.vehicleModel = vehicleModel;
		this.vehicleRegistrationDate = vehicleRegistrationDate;
		this.isRegularCustomer = isRegularCustomer;
		this.contactNumber = contactNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public Date getVehicleRegistrationDate() {
		return vehicleRegistrationDate;
	}

	public void setVehicleRegistrationDate(Date vehicleRegistrationDate) {
		this.vehicleRegistrationDate = vehicleRegistrationDate;
	}

	public boolean isRegularCustomer() {
		return isRegularCustomer;
	}

	public void setRegularCustomer(boolean isRegularCustomer) {
		this.isRegularCustomer = isRegularCustomer;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", vehicleNumber=" + vehicleNumber
				+ ", vehicleModel=" + vehicleModel + ", vehicleRegistrationDate=" + vehicleRegistrationDate
				+ ", isRegularCustomer=" + isRegularCustomer + ", contactNumber=" + contactNumber + "]";
	}

	
	
	
}
