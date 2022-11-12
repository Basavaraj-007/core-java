package com.xworkz.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.app.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private EntityManagerFactory factory;
	private EntityManager manager=null;
	
	public Customer saveCustomer(Customer customer) {
		System.out.println("--------Customer Dao--------");
		boolean isCustomerSaved=false;
		try {
			manager=factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(customer);
			transaction.commit();
			System.out.println("-----Customer saved--------------");
			isCustomerSaved = true;
		}catch (Exception e) {
			e.printStackTrace();
			}finally {
				manager.close();
//				factory.close();
			}		
		return isCustomerSaved ? customer : null;
	}

	@Override
	public List<Customer> findCustomerByGovtID(String govt_id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}


