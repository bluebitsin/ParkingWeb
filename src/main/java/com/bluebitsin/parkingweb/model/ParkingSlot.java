package com.bluebitsin.parkingweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parking_slot")
public class ParkingSlot {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "floor_id")
	private int floorId;
	
	@Column(name = "slot_number")
	private int slotNumber;
	
	@Column(name = "wing_code")
	private char wingCode;
	
	@Column(name = "is_slot_booked")
	private int isSlotBooked;

	public void setIsSlotBooked(int isSlotBooked) {
		this.isSlotBooked = isSlotBooked;
	}

	public ParkingSlot(int id, int floorId, int slotNumber, char wingCode, int isSlotBooked) {
		super();
		this.id = id;
		this.floorId = floorId;
		this.slotNumber = slotNumber;
		this.wingCode = wingCode;
		this.isSlotBooked = isSlotBooked;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFloorId() {
		return floorId;
	}

	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}

	public int getSlotNumber() {
		return slotNumber;
	}

	public void setSlotNumber(int slotNumber) {
		this.slotNumber = slotNumber;
	}

	public char getWingCode() {
		return wingCode;
	}

	public void setWingCode(char wingCode) {
		this.wingCode = wingCode;
	}

	public ParkingSlot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIsSlotBooked() {
		return isSlotBooked;
	}
	
	@Override
	public String toString() {
		return "ParkingSlot [id=" + id + ", floorId=" + floorId + ", slotNumber=" + slotNumber + ", wingCode="
				+ wingCode + "]";
	}
	
}
