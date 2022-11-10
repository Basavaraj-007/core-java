package com.xworkz.app.service;

import java.util.List;

import com.xworkz.app.entity.Bank;

public interface BankService {

	public Bank saveBank(Bank bank);
	public List<Bank> findByBankName(String bankName);
	public Bank updateBank(int bankId);
}
