package com.online.bank.dao;


import com.online.bank.dto.Bank;

public interface BankDao {
	
	public Bank saveBank(Bank bank);
	public Bank findByBankName(String bankName);
	public Bank updateBankAddressByName(String bankName,String address);
	public void deleteBankDetailsByBankName(String bankName);
}
