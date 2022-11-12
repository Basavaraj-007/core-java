package com.xworkz.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.app.dao.CustomerDao;
import com.xworkz.app.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	public Customer saveCustomer(Customer customer) {
		System.out.println("-----customersave()-------CustomerService----");
		return customerDao.saveCustomer(customer);
	}

	public List<Customer> findCustomerByGovtID(String govt_id) {
		return null;
	}

}
