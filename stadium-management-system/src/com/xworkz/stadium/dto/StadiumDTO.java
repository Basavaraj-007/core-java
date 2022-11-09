package com.xworkz.stadium.dto;

public class StadiumDTO {
	private int id;
	private String name;
	private String type;
	private int capacity;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StadiumDTO [id=" + id + ", name=" + name + ", type=" + type + ", capacity=" + capacity + ", address="
				+ address + "]";
	}
	
	

}
