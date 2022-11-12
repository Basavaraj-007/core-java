package com.xworkz.app.dao;

import java.util.List;

import com.xworkz.app.entity.Customer;

public interface CustomerDao {

	public Customer saveCustomer(Customer customer); 
	
	public List<Customer> findCustomerByGovtID(String govt_id);
}
