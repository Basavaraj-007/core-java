package com.online.bank.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.online.bank.dto.Customer;
import com.online.bank.service.CustomerService;
import com.online.bank.util.AccountStatus;

@Controller
public class CustomerController {

	public CustomerController() {
		System.out.println("------CustomerController created------");
	}

	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/custreg")
	public ModelAndView clickForCustomerRegistration() {
		System.out.println("------clickForCustomerRegistration created------");

		return new ModelAndView("customer");

	}

	@RequestMapping("/home")
	public String homePage() {

		return "index";
	}

	@RequestMapping("/new")
	public String newCustomerForm(Map<String, Object> model) {
		System.out.println("------clickForCustomerRegistration created------");
		Customer customer = new Customer();
		model.put("customer", customer);
		return "customer";
	}

	@RequestMapping(value = "customersave", method = RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute Customer customer) {

		Customer customerResponse = customerService.saveCustomer(customer);
		System.out.println("Customer saved---" + customerResponse.getUserName());

		return new ModelAndView("customersaved", "cust", customerResponse);
	}

	@RequestMapping(value = "findcustomer", method = RequestMethod.GET)
	public ModelAndView findCustomerByName(@RequestParam String firstName) {
		System.out.println("----findCustomerByName---controller---");
		List<Customer> listCustomer = customerService.findByCustomerName(firstName);
		return new ModelAndView("customerfound", "customers", listCustomer);
	}

	@RequestMapping(value = "updatecustomeraddress", method = RequestMethod.GET)
	public ModelAndView updateCustomerAddressByName(String firstName, String address) {
		System.out.println("---updateCustomerAddressByName---controller");

		Customer updated = customerService.updateCustomerAddressByName(firstName, address);
		return new ModelAndView("updatedcustomeraddress", "updates", updated);
	}

	@RequestMapping(value = "deletecustomer", method = RequestMethod.GET)
	public ModelAndView deleteCustomerDetailsByName(String firstName) {
		System.out.println("---deleteCustomerDetailsByName---Controller");
		customerService.deleteCustomerDetailsByName(firstName);

		return new ModelAndView("customerdeleted" + "");
	}

	@RequestMapping(value = "logincustomer", method = RequestMethod.POST)
	public String loginCustomer(HttpSession session, @RequestParam String mailId, @RequestParam String password,ModelMap map) {
		System.out.println("----loginCustomer---controller---" + mailId);
		System.out.println("----loginCustomer---password---" + password);

		Customer listCustomer = customerService.loginCustomer(mailId, password);
		   session.setAttribute("customer", listCustomer);
		if (listCustomer != null && listCustomer.getStatus().equals(AccountStatus.ACTIVE.toString())) {
			map.addAttribute("customers", listCustomer);
	         session.setAttribute("customer", listCustomer);
			return "redirect:/customer/dashboard";
					//new ModelAndView("index", "customers", listCustomer);

		} else if (listCustomer != null && listCustomer.getStatus().equals(AccountStatus.INACTIVE.toString())) {
			map.addAttribute("accountlocked", "Your Account has Locked");

			return "loginfailed";

		} else {
			return "loginfailed";

		}
	}

	@RequestMapping("/unlock")
	public String unlockPage() {

		return "unlock";
	}
	
	@RequestMapping("/loginpage")
	public String loginPage() {

		return "login";
	}

	@RequestMapping(value = "unlockcutomer", method = RequestMethod.POST)
	public ModelAndView unlockCuyomer(@RequestParam String email) {
		System.out.println("---unlockCuyomer---Controller");
		boolean value = customerService.unlockWhenTimeExpired(email);
		if (value) {

			return new ModelAndView("unlock", "cutomerunlocked", "Successfully Cutomer Unlocked");

		} else {
			return new ModelAndView("unlock", "cutomerunlocked", "UNSuccessfully Cutomer Unlocked");

		}
	}
	
	
	@RequestMapping("/customer/dashboard")
	   public String userInfo(HttpSession session) {
		   
		 Customer customer = (Customer)session.getAttribute("customer");
	      return "index";
	   }

	 
	@RequestMapping("/logout")
	   public String logout(HttpSession session ) {
		System.out.println("---logout---Controller");

	      session.invalidate();
	      return "redirect:/loginpage";
	   }
	   
}
