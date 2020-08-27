package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CAR_DETAILS")
public class CarDetails {
	
	@Column(name="regno",length=5)
	private String regNo;
	@Id
	@Column(name="model",length=20)
	private String model;
	@Column(name="color",length=10)
	private String color;
	@Column(name="manufacturer",length=20)
	private String manufacturer;
	
	public CarDetails() {
		super();
	}
	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public CarDetails(String rNo,String model,String color,String manufacturer) {
		this.regNo=rNo;
		this.color=color;
		this.model=model;
		this.manufacturer=manufacturer;
	}
	
	
	public String toString() {
		return "Reg No:"+regNo+", Model:"+model+", Color:"+color+", Manufacture:"+manufacturer;
	} 
	
	
	
	

}
