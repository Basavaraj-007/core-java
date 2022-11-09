package com.xworkz.hotel.dto;

public class FoodItemDto {

	private int id;
	   private String name;
	   private double price;
	   private boolean isAvailable;
	   private String itemdetails;
	   private String type;

	  public FoodItemDto(){
	    System.out.println("FoodItemDto object is created");
	  }

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getItemdetails() {
		return itemdetails;
	}

	public void setItemdetails(String itemdetails) {
		this.itemdetails = itemdetails;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "FoodItemDto [id=" + id + ", name=" + name + ", price=" + price + ", isAvailable=" + isAvailable
				+ ", itemdetails=" + itemdetails + ", type=" + type + "]";
	}
	  
	  
}
