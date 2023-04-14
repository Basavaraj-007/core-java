package com.online.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.online.bank.dto.Bank;

@Service
//@Transactional
public interface BankService {
	
	public Bank saveBank(Bank bank);
	public Bank findByBankName(String bankName);
	public Bank updateBankAddressByName(String bankName,String address);
	public void deleteBankDetailsByBankName(String bankName);



}

