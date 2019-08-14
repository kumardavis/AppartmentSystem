package com.example.AppartmentSystem.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long addId;
	private String location;
	private String city;
	@OneToOne(mappedBy="address",fetch=FetchType.LAZY)
	private Appartment appartment;
	
	public long getAddId() {
		return addId;
	}
	public void setAddId(long addId) {
		this.addId = addId;
	}
	public Appartment getAppartment() {
		return appartment;
	}
	public void setAppartment(Appartment appartment) {
		this.appartment = appartment;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	 
	
}
