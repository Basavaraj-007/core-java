package com.xworkz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employe emp =new Employe();
		//emp.setEmpId(empId);
		emp.setName("Jon Stark");
		emp.setAddress("WInterfell");
		//step 2:-
		EntityManagerFactory factoryManager=	Persistence.createEntityManagerFactory("Employe_xworkz");
		
		//step 3:-
		EntityManager entityManager = factoryManager.createEntityManager();
		
		//step 4:-
		EntityTransaction transaction=entityManager.getTransaction();
		
		transaction.begin();
		
//	entityManager .persist(emp);
		
	//	Employe removeemp = entityManager.find(Employe.class, 1);
		//entityManager .remove(removeemp);
		
	/*	Employe emp2 = entityManager.find(Employe.class, 3);
		emp2.setAddress("Karachi");
		   //entityManager.merge(updateCollage);*/
		
		transaction.commit();
		entityManager.close();
		factoryManager.close();
		getAllEmployees();
		System.out.println("--------------get name-------------");
		getEmployeeName();
		
	}

		//System.out.println("---------------------------- Employe info----------"+emp2.toString());
		
		//home work:- user registration 
		//(int  id,string name,string email(should be unique), int age, date dob, string password(should be encrypted)
		//All crud operations:
		/*saveUser(){// persist method}
		 * getUserById() // find method
		 * updateUser() // merge method
		 * deleteUser() // remove method
		 * */
		
		public static void getAllEmployees() {
			
		//will from 
		
EntityManagerFactory factoryManager=	Persistence.createEntityManagerFactory("Employe_xworkz");
		
		//step 3:-
		EntityManager entityManager = factoryManager.createEntityManager();
		
		//step 4:-
		EntityTransaction transaction=entityManager.getTransaction();
		
		transaction.begin();

		Query query=entityManager.createQuery("from Employe");
		
		query.getResultList().forEach(e->{
			
			System.out.println("emp:"+e.toString());
			
		});
		
		transaction.commit();
		entityManager.close();
		factoryManager.close();

		
	}

		public static void getEmployeeName() {
			
			EntityManagerFactory factoryManager=	Persistence.createEntityManagerFactory("Employe_xworkz");
			
			//step 3:-
			EntityManager entityManager = factoryManager.createEntityManager();
			
			//step 4:-
			EntityTransaction transaction=entityManager.getTransaction();
			
			transaction.begin();

			Query query=entityManager.createQuery("select  a.name from Employe a");
			
			query.getResultList().forEach(e->{
				
				System.out.println("emp:"+e.toString());
				
			});
			
			transaction.commit();
			entityManager.close();
			factoryManager.close();
			
		}
		
}
