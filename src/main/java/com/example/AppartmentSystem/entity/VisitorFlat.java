package com.example.AppartmentSystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*@AssociationOverrides({
    @AssociationOverride(name = "pk.flat", 
        joinColumns = @JoinColumn(name = "flatId")),
    @AssociationOverride(name = "pk.visitor", 
        joinColumns = @JoinColumn(name = "vId")) })*/
@Entity
public class VisitorFlat implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;

	private long flatId;
	private long vId;
	private String inTime;
	private String outTime;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public long getFlatId() {
		return flatId;
	}

	public void setFlatId(long flatId) {
		this.flatId = flatId;
	}

	public long getvId() {
		return vId;
	}

	public void setvId(long vId) {
		this.vId = vId;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

}
