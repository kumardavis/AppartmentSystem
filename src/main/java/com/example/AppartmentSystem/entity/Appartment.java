package com.example.AppartmentSystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Appartment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long appId;
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addId")
	private Address address;
	@OneToMany(mappedBy="appartment",cascade=CascadeType.ALL)	
	private List<Flat> flat;	
	public List<Flat> getFlat() {
		return flat;
	}
	public void setFlat(List<Flat> flat) {
		this.flat = flat;
	}
	public long getId() {
		return appId;
	}
	public void setId(long id) {
		this.appId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd_Id() {
		return address;
	}
	public void setAdd_Id(Address address) {
		this.address = address;
	}
	
	

}
