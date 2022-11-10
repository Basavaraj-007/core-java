package com.xworkz.customer.crud.impl;

import com.xworkz.customer.crud.CustomerC;
import com.xworkz.customer.dto.OrderDTO;

public class CustomerImpl implements CustomerC {

	 

		  OrderDTO dtos[];
		  int index;
		  
		  public CustomerImpl(){
			  dtos=new OrderDTO[index];
			  System.out.println("CustomerCrud object created");
		  }
		  
		  @Override
		  public boolean createCustomerDetails(OrderDTO dto){
			  System.out.println("start of createCustomerDetails()");
			    boolean isAdded=false;
				if(dto!=null && dto.getName()!=null){
					this.dtos[index++]=dto;
					isAdded=true;
					System.out.println("Customer details added successfully");
				}
				else{
					System.out.println("Please enter customer details");
				}
			return isAdded;
		  }
		  
		  @Override
		  public void getCustomerDetails(){
			  System.out.println("start of getCustomerDetails()");
			  for(int i=0;i<dtos.length;i++){
			  System.out.println(dtos[i]);
		      }
		  }

		  @Override
		  public boolean updateCustomerAddressById(int id,String address){    
			  System.out.println("start of updateCustomerAddressById()");
			  boolean updatedAddress=false;
			  for(int i=0;i<dtos.length;i++){    
				  if(dtos[i].getId()==id){        
					  updatedAddress=true;
					  dtos[i].setAddress(address);     
					  System.out.println("Customer Address updated successfully");
				  }
				  else{
					  System.out.println("Couldnot update Customer address,please provide proper id");
				  }
			  }
			  return updatedAddress;
		  }
		  
		  @Override
		   public boolean updateCustomerContactNoByName(String name,long contactNo){
			  System.out.println("start of updateCustomerContactNoByName()");
			  boolean updatedContactNo=false;
			  for(int i=0;i<dtos.length;i++){
				  if(dtos[i].getName().equals(name)){
					  updatedContactNo=true;
					  dtos[i].setContactNo(contactNo);
					  System.out.println("Customer contact no is updated successfully");
					 
				  }
				  else{
					  System.out.println("Couldnot update Customer contact no , please enter proper Customer name");
				  }
			  }
			  return updatedContactNo;
		  } 
		  
		  @Override
		  public boolean getOrderNameById(int id){
			  System.out.println("inside of getOrderNameById()");
			  boolean isOrderName = false;
			  for(int i=0;i<dtos.length;i++){
				  if(dtos[i].getId() == id){
					  System.out.println("order name is "+dtos[i].getOrderName());
					  isOrderName = true;
				  }
				  else{
					  System.out.println("could not found");
				  }
			  }
			  return isOrderName;
		  }
		  
		  @Override
		   public boolean getOrderTypeByName(String name){
			   System.out.println("inside of getOrderTypeByName()");
			   boolean isOrderType = false;
			   for(int i=0;i<dtos.length;i++){
				   if(dtos[i].getName().equals(name)){
				   System.out.println("order type is "+dtos[i].getOrderType());
				   isOrderType = true;
			   }
			   else{
				   System.out.println("order type not found");
			   }
			   }
			   return isOrderType; 
		   }
		    
			@Override
			 public int[] getAllQuantities(){

				 int i,j;
				 for( j=0,i=0;i<dtos.length;i++){
		              System.out.println(dtos[i].getQuatity());			 
					  j++;
				 }
				   
				    int[] allQuantities = new int[j];
				  for(int k=0,m=0;k<dtos.length;k++){
					 allQuantities[m++] = dtos[k].getQuatity(); 
				  }

				 return allQuantities;
			 }
			 
			 @Override
			  public String[] getAllOrderName(){
				 
				 int i,j;
				 for( j=0,i=0;i<dtos.length;i++){ 
				     System.out.println(dtos[i].getName());
					  j++;
				 }
				    
				    String[] allOrderName = new String[j];
				  for(int k=0,m=0;k<dtos.length;k++){
					 allOrderName[m++] = dtos[k].getName(); 
				  }

				 return allOrderName;
			 }	
}
