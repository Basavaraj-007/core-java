package com.xworkz.customer.crud;

import com.xworkz.customer.dto.OrderDTO;

public interface CustomerC {


	 public boolean createCustomerDetails(OrderDTO dto);
	  public void getCustomerDetails();
	  public boolean updateCustomerAddressById(int id,String address);
	  public boolean updateCustomerContactNoByName(String name,long contactNo);
	  public boolean getOrderNameById(int id);
	  public boolean getOrderTypeByName(String name);
	   public int[] getAllQuantities();
	    public String[] getAllOrderName();
}
