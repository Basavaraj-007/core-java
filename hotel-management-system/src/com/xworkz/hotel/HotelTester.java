package com.xworkz.hotel;

import java.util.Scanner;


import com.xworkz.hotel.crud.impl.HotelImpl;
import com.xworkz.hotel.dto.FoodItemDto;

public class HotelTester {

	  public static void main(String[] args){
		  
			 Scanner sc=new Scanner(System.in);
			   System.out.println("Enter the number of Food Items ");
			   int size=sc.nextInt();
			   
			 HotelImpl hotel=new HotelImpl(size);
		   
			  for(int i=0;i<size;i++){
				  FoodItemDto dto=new FoodItemDto();
				  
				  System.out.println("Enter food item id");
				  int id=sc.nextInt();
				  System.out.println("Enter food item name");
				  String name=sc.next();
				  System.out.println("Enter food item price");
				  double price=sc.nextDouble();
				  System.out.println("Enter isAvailable");
				  boolean isAvailable=sc.nextBoolean();
				  System.out.println("Enter itemdetails");
				  String itemdetails=sc.next();
				  System.out.println("Enter type");
				  String type = sc.next();
				    dto.setId(id);
					dto.setName(name);
					dto.setPrice(price);
					dto.setAvailable(isAvailable);
					dto.setItemdetails(itemdetails);
					dto.setType(type);
					
				hotel.createFoodItem(dto);
			  }
			  
				 String option = null;
				 do{
					   System.out.println("Enter 1 for all food details");
					   System.out.println("Enter 2 for update price by id");
					   System.out.println("Enter 3 is Avaialable food by name");
					   System.out.println("Enter 4 for all fooditem name");
					   
					   System.out.println("Enter choice");
					   int choice = sc.nextInt();
					   
					   switch(choice){
						   case 1 : hotel.getFoodItem();
						             break;
						   case 2 : System.out.println("Enter the existing id to update the price");
				                    int existingId = sc.nextInt();
				                    System.out.println("Enter price to be update");
				                    int updatePrice = sc.nextInt();
				                    hotel.updatePriceById(existingId, updatePrice);
						             break ;
						   case 3 :  System.out.println("Enter the name to show isAvailable");
				                     String existingName = sc.next();
									 System.out.println("enter  isAvailable by name");
									 boolean isAvailable = sc.nextBoolean();
									 hotel.updateIsAvailableByName(existingName,isAvailable);		                     
						             break ;
				
						   case 4 :  hotel.getAllFoodItemName();
						             break ;
						   default :  System.out.println("Enter valid choice");
						             break ;
					   } 
					   
					   System.out.println("Do you want to continue Y/N");
					   option = sc.next();
					 
				 }while(option.equalsIgnoreCase("Y"));
				 
sc.close()	;			 
			     
				
			  }


		}

	


