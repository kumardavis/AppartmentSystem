package com.example.AppartmentSystem.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Flat implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long flatId;
	private long flatNo;
	private long flatOwnerId;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="appId")
	private Appartment appartment;
	
	@OneToOne()
	@JoinColumn(name="ownerId")
	private Owner owner;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(
		        name = "VisitorFlat", 
		        joinColumns = { @JoinColumn(name = "flatId") }, 
		        inverseJoinColumns = { @JoinColumn(name = "vId") }
		    )
	private Set<Visitor> visitors;
	
	public Appartment getAppartment() {
		return appartment;
	}
	public void setAppartment(Appartment appartment) {
		this.appartment = appartment;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public long getFlatId() {
		return flatId;
	}
	public void setFlatId(long flatId) {
		this.flatId = flatId;
	}
	public long getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(long flatNo) {
		this.flatNo = flatNo;
	}
	public long getFlatOwnerId() {
		return flatOwnerId;
	}
	public void setFlatOwnerId(long flatOwnerId) {
		this.flatOwnerId = flatOwnerId;
	}
	public Set<Visitor> getVisitors() {
		return visitors;
	}
	public void setVisitors(Set<Visitor> visitors) {
		this.visitors = visitors;
	}
}
