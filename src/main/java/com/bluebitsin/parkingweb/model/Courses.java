package com.bluebitsin.parkingweb.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private long id;
	private String name;
	private String descreption;
	
	
	public Courses(long id, String name, String descreption) {
		this.id = id;
		this.name = name;
		this.descreption = descreption;
	}
	
	
	
	public Courses() {
		
	}


	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescreption() {
		return descreption;
	}
	
	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}
	
	@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + ", descreption=" + descreption + "]";
	}
	
}
