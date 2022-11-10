package com.xworkz.app.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.app.dto.Employee;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EntityManagerFactory factory;
	private EntityManager entityManager=null;
	
	
	public Employee save(Employee employee) {
		System.out.println("------EmployeeDao");
		boolean isEmployeeSaved=false;
		try {
		entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(employee);
		transaction.commit();
		entityManager.close();
		factory.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return isEmployeeSaved? employee : null;
	}

	public Employee searchByEmployeeFirstName(String firstname) {
		// TODO Auto-generated method stub
		return null;
	}

}
