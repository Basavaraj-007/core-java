package com.xworkz.app.service;

import java.util.List;

import com.xworkz.app.entity.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer customer);
	public List<Customer> findCustomerByGovtID(String govt_id); 
}
