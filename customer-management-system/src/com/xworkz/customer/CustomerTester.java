package com.xworkz.customer;

import java.util.Scanner;

import com.xworkz.customer.crud.impl.CustomerImpl;
import com.xworkz.customer.dto.OrderDTO;

public class CustomerTester {
	
	public static void main(String[] args){
		 
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the number of customers ");
		   int size=sc.nextInt();
		   
		 CustomerImpl cus=new CustomerImpl();
	   
		  for(int i=0;i<size;i++){
			  OrderDTO dto=new OrderDTO();
			  
			  System.out.println("Enter customer id");
			  int id=sc.nextInt();
			  System.out.println("Enter customer name");
			  String name=sc.next();
			  System.out.println("Enter address of customer");
			  String address=sc.next();
			  System.out.println("Enter orderNo ");
			  String orderNo=sc.next();
			  System.out.println("Enter Order Name");
			  String orderName = sc.next();
			  System.out.println("Enter Order Type");
			  String orderType = sc.next();
			  System.out.println("Enter quantities");
			  int quantities = sc.nextInt();
			  System.out.println("Enter contact Number of customer");
			  long contactNo=sc.nextLong();
			  System.out.println("Enter bill amount of the order");
			  double billAmount=sc.nextDouble();
			    dto.setId(id);
				dto.setName(name);
				dto.setAddress(address);
				dto.setContactNo(contactNo);
				dto.setBillAmount(billAmount);
				dto.setOrderNO(orderNo);
				dto.setOrderName(orderName);
				dto.setOrderType(orderType);
				dto.setQuatity(quantities);
			
				cus.createCustomerDetails(dto);
		  }
		  
		  String option = null;
		  do{
			  System.out.println("Enter 1 fetch all the patients");
			  System.out.println("Enter 2 to update customer address by name");
			  System.out.println("Enter 3 to update customer contact no By name");
			  System.out.println("Enter 4 to get customer order name by id");
			  System.out.println("Enter 5 to get order type by name");
			  System.out.println("Enter 6 to get All Quantities");
			  System.out.println("Enter 7 to get all order name");
			  System.out.println("Enter the choices");
			  int choise = sc.nextInt();
			  
			  switch(choise){
				  case 1 : cus.getCustomerDetails();
				  break;
				  
				  case 2 :	System.out.println("Enter the existing id for which address has to be updated");
							int existingId=sc.nextInt();
							System.out.println("Enter the address to be updated");
							String updatedAddress=sc.next();
							cus.updateCustomerAddressById(existingId,updatedAddress);
							break;
							
				  case 3 :	System.out.println("Enter the existing name for which contact no has be updated");
							String existingName=sc.next();
							System.out.println("Enter the contact no to be updated");
							long updatedContactNo=sc.nextLong();
							cus.updateCustomerContactNoByName(existingName,updatedContactNo); 		
							break;
							
				  case 4 : System.out.println("Enter the Id to show Name");
						   int existingId1 = sc.nextInt();
						   System.out.println("the order name by id");
				sc.next();
						   cus.getOrderNameById(existingId1);
						   break;
						   
				  case 5 : System.out.println("Enter the name to show Order Type");
						   String exstingName = sc.next();
						   System.out.println("the order type by name");
				sc.next();
							cus.getOrderTypeByName(exstingName);
							break;
							
				  case 6 : cus.getAllQuantities();
							break;
				  
				  case 7 : cus.getAllOrderName();
							break;
				  default : System.out.println("Given choise cannot be delivered");
							break;
							
			  }
			  System.out.println("Do you want to continue y/n");
			  option = sc.next();
		  }
		  while(option.equals("Y"));
	sc.close();	 
	}
		 }
		  

		
