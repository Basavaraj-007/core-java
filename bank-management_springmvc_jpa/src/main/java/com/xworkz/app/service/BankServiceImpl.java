package com.xworkz.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.app.dao.BankDao;
import com.xworkz.app.entity.Bank;

@Service
public class BankServiceImpl  implements BankService {
	@Autowired
private BankDao bankDao;

	public Bank saveBank(Bank bank) {
		System.out.println("-----bank/save()-------BankService----");
		return bankDao.saveBank(bank);
	}

	public List<Bank> findByBankName(String bankName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bank updateBank(int bankId) {
		// TODO Auto-generated method stub
		return null;
	} 

}
