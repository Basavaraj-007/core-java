package com.xworkz.app.dao;

import java.util.List;

import com.xworkz.app.entity.Bank;

public interface BankDao {

	public Bank saveBank(Bank bank);
	public List<Bank> findByBankName(String bankName);
	public Bank updateBank(int bankId);
}
