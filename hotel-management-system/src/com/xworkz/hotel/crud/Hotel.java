package com.xworkz.hotel.crud;

import com.xworkz.hotel.dto.FoodItemDto;

public interface Hotel {
	
	public boolean createFoodItem(FoodItemDto dto);
	public void getFoodItem();
	 public boolean updatePriceById(int id,double price);
	 public boolean updateIsAvailableByName(String name,boolean isAvailable);
	 public String[] getAllFoodItemName();
	

}
