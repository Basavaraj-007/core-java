package com.online.bank.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.online.bank.dto.Bank;
import com.online.bank.dto.Customer;
import com.online.bank.service.BankService;

@Controller
//@RequestMapping("bank")
public class BankController {
	public BankController() {
		System.out.println("-----BankContoller created-----");
	}
	
	@Autowired
	private BankService bankService;
	
	
	@RequestMapping("/addBank")
	public String newBankForm(Map<String, Object> model) {
		System.out.println("------newBankForm created------");
	    Bank bank = new Bank();
	    model.put("bank", bank);
	    return "addbank";
	}
@RequestMapping(value = "banksave", method = RequestMethod.POST)
	public ModelAndView saveBank(@ModelAttribute Bank bank) {
		System.out.println("----saveBank created-----");
		Bank bankResponse = bankService.saveBank(bank);
		System.out.println("-----Bank saved----"+bankResponse.getBankName());		
		return new ModelAndView("banksaved");
	}
	
	
@RequestMapping(value = "findbank", method = RequestMethod.GET)
	public ModelAndView findBankByName(@RequestParam String bankName) {
		System.out.println("----findBankByName---controller---");
		Bank listBank= (Bank) bankService.findByBankName(bankName);
		return new ModelAndView("customer","banks",listBank);
	}
	
@RequestMapping(value = "updatebankaddress", method = RequestMethod.GET)
	public ModelAndView updateBankAddressByBankName(String bankName, String address) {
		System.out.println("---updateBankAddressByBankName---controller");
		
	 	Bank updated= bankService.updateBankAddressByName(bankName, address);
		return new ModelAndView("updatedbankaddress","updates",updated);
		}
		
@RequestMapping(value = "deletebank", method = RequestMethod.GET)
	public ModelAndView deleteBankDetailsByName(String bankName) {
		System.out.println("---deleteBankDetailsByName---Controller");
		 bankService.deleteBankDetailsByBankName(bankName);
		
		return new ModelAndView("bankdeleted");
	}
	
}
