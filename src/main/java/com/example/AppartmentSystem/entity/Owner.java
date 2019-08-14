package com.example.AppartmentSystem.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Owner {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ownerId;
	private String ownerName;
	private String ownerContact;
	private String emailId;
	@OneToOne(mappedBy="owner",fetch=FetchType.LAZY)
	private Flat flat;
	
	
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerContact() {
		return ownerContact;
	}
	public void setOwnerContact(String ownerContact) {
		this.ownerContact = ownerContact;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	

}
