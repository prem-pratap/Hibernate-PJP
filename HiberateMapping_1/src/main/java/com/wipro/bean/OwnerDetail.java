package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="owner_details")
public class OwnerDetail {
	
	@Id
	@Column(name="ownerid")
	private int OwnerId;
	@Column(name="ownername")
	private String OwnerName;
	@OneToOne
	
	private CarDetails car;
	
	public int getOwnerId() {
		return OwnerId;
	}

	public void setOwnerId(int ownerId) {
		OwnerId = ownerId;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}

	public CarDetails getCar() {
		return car;
	}

	public void setCar(CarDetails car) {
		this.car = car;
	}

	public OwnerDetail() {
		super();
	}
	
	public OwnerDetail(int oid,String oname,CarDetails car) {
		this.OwnerId=oid;
		this.OwnerName=oname;
		this.car=car;
	}
	
	public String toString() {
		return "Owner Id:"+OwnerId+", OwnerName:"+", Car:["+car+"]";
	}
	
}
