package com.xworkz.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.app.entity.Bank;
import com.xworkz.app.entity.Customer;
import com.xworkz.app.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="customersave" ,method=RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute Customer customer) {
		
		Customer customerResponse= customerService.saveCustomer(customer);
		System.out.println("--------Customer saved--------"+customer.getGovt_id());
		return new ModelAndView("customer");
		
	}
	
	
	
}
