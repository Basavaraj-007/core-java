package com.xworkz.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.app.entity.Bank;

@Repository
public class BankDaoImpl implements BankDao {

	public BankDaoImpl() {
		System.out.println("-------------------------BankDao-----------------------");
		}
	
	@Autowired
	private EntityManagerFactory factory;
	
	private EntityManager manager=null;
	public Bank saveBank(Bank bank) {
		

		boolean isBankSaved=false;
		try {
		manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(bank);
		transaction.commit();		
		System.out.println("------Bank Saved------");
		isBankSaved =true;
		}
		catch (Exception e) {
		e.printStackTrace();
		}finally {
			manager.close();
//			factory.close();
		}		
		//validation
		return isBankSaved ? bank : null;
		
		
	}

	public List<Bank> findByBankName(String bankName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Bank updateBank(int bankId) {
		// TODO Auto-generated method stub
		return null;
	}

}
