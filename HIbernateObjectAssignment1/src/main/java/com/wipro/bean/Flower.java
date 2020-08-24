package com.wipro.bean;

public class Flower {
	private String flowerId;
	private String flowerName;
	private String color;
	private int price;
	public String getFlowerId() {
		return flowerId;
	}

	public void setFlowerId(String flowerId) {
		this.flowerId = flowerId;
	}

	public String getFlowerName() {
		return flowerName;
	}

	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	public Flower(String fid,String fname,String color ,int price) {
		this.flowerId=fid;
		this.flowerName=fname;
		this.color=color;
		this.price=price;
	}
	
	public Flower() {
		
	}

	public String toString() {
		return "Flower Id:"+flowerId+", Flower Name:"+flowerName+", Color:"+color+", Price:"+price;
	}
}
