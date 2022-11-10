package com.xworkz.hotel.crud.impl;

import com.xworkz.hotel.crud.Hotel;
import com.xworkz.hotel.dto.FoodItemDto;

public class HotelImpl implements Hotel{

		   FoodItemDto dtos[];
		   int index;
		   
		   public HotelImpl(int size){
			   dtos=new FoodItemDto[size];
			   System.out.println("HotelCrud object created");
		   }
		   
		   @Override
		   public boolean createFoodItem(FoodItemDto dto){
			   System.out.println("Start of createFoodItem()");
			    boolean isAdded=false;
			 if(dto!=null && dto.getName()!= null){
				 this.dtos[index++]=dto;
				 isAdded=true;
				 System.out.println("Food Item created succesfully");
			 }else{
				 System.out.println("Enter the Food item details first");
			 }
			 return isAdded;
			   
		   }

		   @Override
		    public void getFoodItem(){
			  System.out.println("Start of getFoodItem()");
			  for(int i=0;i<dtos.length;i++){
				  System.out.println(dtos[i]);
			  }
		    }
			
			@Override
		  public boolean updatePriceById(int id,double price){    
			  System.out.println("start of updatePriceById()");
			  boolean updatedPrice=false;
			  for(int i=0;i<dtos.length;i++){      
				  if(dtos[i].getId()==id){        
					  updatedPrice=true;
					  dtos[i].setPrice(price);    
					  System.out.println("Price updated successfully");
				  }
				  else{
					  System.out.println("Couldnot update price,please provide proper id");
				  }
			  }
			  return updatedPrice;
		  }
		  
		  
		 
			@Override
		   public boolean updateIsAvailableByName(String name,boolean isAvailable){
			  System.out.println("start of updateIsAvailableByName()");
			  boolean updatedIsAvailable=false;
			  for(int i=0;i<dtos.length;i++){
				  if(dtos[i].getName().equals(name)){
					  updatedIsAvailable=true;
					  dtos[i].setAvailable(isAvailable);
					  System.out.println("isAvailable is updated successfully");
				  }
				  else{
					  System.out.println("Couldnot update isAvailable , please enter proper food item name");
				  }
			  }
			  return updatedIsAvailable;
		  }
		  
		  @Override
		   public String[] getAllFoodItemName(){
				 System.out.println("Inside getAllFoodItemName ");
				 int i,j;
				 for( j=0,i=0;i<dtos.length;i++){ 
					  System.out.println(dtos[i].getName());
					  j++;
				 }
				    
				  String[] allFoodName = new String[j];
				   for(int k=0,m=0;k<dtos.length;k++){
					 allFoodName[m++] = dtos[k].getName(); 
				  }
		           System.out.println("End getAllFoodItemName ");
				 return allFoodName;
			 }
			 

}
