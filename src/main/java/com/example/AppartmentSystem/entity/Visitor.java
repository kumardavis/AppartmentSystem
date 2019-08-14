package com.example.AppartmentSystem.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Visitor implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4394305302948903253L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long vId;
	private String visitorName;
	private String contactNo;
	private String vechileno;
	private String visitorIdno;
	private String idType;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
	        name = "VisitorFlat", 
	        joinColumns = { @JoinColumn(name = "vId") }, 
	        inverseJoinColumns = { @JoinColumn(name = "flatId") }
	    ) 
	private Set<Flat> flatList;

	public long getvId() {
		return vId;
	}

	public void setvId(long vId) {
		this.vId = vId;
	}

	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getVechileno() {
		return vechileno;
	}

	public void setVechileno(String vechileno) {
		this.vechileno = vechileno;
	}

	public String getVisitorIdno() {
		return visitorIdno;
	}

	public void setVisitorIdno(String visitorIdno) {
		this.visitorIdno = visitorIdno;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public Set<Flat> getFlatList() {
		return flatList;
	}

	public void setFlatList(Set<Flat> flatList) {
		this.flatList = flatList;
	}
}
