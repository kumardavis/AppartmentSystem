package com.example.AppartmentSystem.entity;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class VisitorFlatId implements java.io.Serializable{

	private Flat flat;
	private Visitor visitor;
	
	@ManyToOne
	public Flat getFlat() {
		return flat;
	}
	public void setFlat(Flat flat) {
		this.flat = flat;
	}
	
	@ManyToOne
	public Visitor getVisitor() {
		return visitor;
	}
	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}
	
	 @Override
	    public int hashCode() {
	         int result;
	            result = (flat != null ? flat.hashCode() : 0);
	            result = 17 * result + (visitor != null ? visitor.hashCode() : 0);
	            return result;
	    }
	 
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (!(obj instanceof VisitorFlatId))
	            return false;
	        VisitorFlatId other = (VisitorFlatId) obj;
	        if (visitor == null) {
	            if (other.visitor != null)
	                return false;
	        } else if (!visitor.equals(other.visitor))
	            return false;
	        if (flat == null) {
	            if (other.flat != null)
	                return false;
	        } else if (!flat.equals(other.flat))
	            return false;
	        return true;
	    }
	
	

}
