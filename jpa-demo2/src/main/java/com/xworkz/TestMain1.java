package com.xworkz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestMain1 {

	public static void main(String[] args) {

	//step 1:- create entity object and set values using setter and set the values
		
		Student student =new Student();
		student.setId(01);
		student.setStudentName("Tukaram");
		student.setStudentAge(20);
		student.setStudentSection("C");
		student.setMarks(520);
		
		
		
		
		/*person.setId(900);
		person.setFirstName("Bullet");
		person.setLastName("Bhaskar");*/
		
		//step 2:-
		EntityManagerFactory factoryManager=	Persistence.createEntityManagerFactory("Student_xworkz");
		
		//step 3:-
		EntityManager entityManager = factoryManager.createEntityManager();
		
		//step 4:-
		EntityTransaction transaction=entityManager.getTransaction();
		
		transaction.begin();
		
		//step 5:-		
		 //persist methood will  insert Record in table 
		entityManager.persist(student);
		
		//commit method flush out all data into DB 
		transaction.commit();
		entityManager.close();
		factoryManager.close();
		
		
		
		
	}

}
