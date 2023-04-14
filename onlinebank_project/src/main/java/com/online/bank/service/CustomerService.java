package com.online.bank.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.online.bank.dto.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer customer);
	public List<Customer> findByCustomerName(String firstName);
	public Customer updateCustomerAddressByName(String firstName,String address);
	public void deleteCustomerDetailsByName(String firstName);
	
	public Customer loginCustomer(String mailId, String password);
	
	  public void updateFailedAttempts(int failAttempts, String email);
	  
		public Customer findByEmail(String email);

		  public boolean unlockWhenTimeExpired(String email);
	
}
