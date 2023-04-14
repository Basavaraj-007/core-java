package com.online.bank.dao;

import java.util.List;

import com.online.bank.dto.Customer;

public interface CustomerDao {
	
	public Customer saveCustomer(Customer customer);
	public List<Customer> findByCustomerName(String firstName);
	public Customer updateCustomerAddressByName(String firstName,String address);
	public void deleteCustomerDetailsByName(String firstName);
	
	public Customer loginCustomer(String mailId, String password);
	  public void updateFailedAttempts(int failAttempts, String email);
	  public Customer findByEmail(String email);
	  
	  public void lockCustomer(String email);
	  
	  public boolean unlockCustomer(String email);
	     
}
