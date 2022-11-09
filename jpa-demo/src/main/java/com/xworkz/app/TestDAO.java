package com.xworkz.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestDAO {

	public static void main(String[] args) {
		
		//step 1:- create entity object and set values using setter and set the values
		
		/*Person person =new Person();
		person.setId(1000);
		person.setFirstName("Sudigaali");
		person.setLastName("Sudheer");*/
		
		/*person.setId(900);
		person.setFirstName("Bullet");
		person.setLastName("Bhaskar");*/
		
		/*home work :-			   Person getPerson=     entityManager.find(person.Class,1);
		
		entityManager .remove(getPerson);
	   Person updatePerson=     entityManager.find(person.Class,1);
	   updatePerson.setFirstName("BP");
	   entityManager.merge(updatePerson);*/
		
		//step 2:- its used to create entity manager by reading persistence.xml and it will load all DB and hibernate properties to entity object,
		//entity manager factory its an interface,for each DB only one EntityMAnagerFactory. database properties are url,driver,user and password.
		EntityManagerFactory factoryManager=	Persistence.createEntityManagerFactory("Person_xworkz");
		
		//step 3:-//used to perform crud operations 
		//entity manager is interface 
		EntityManager entityManager = factoryManager.createEntityManager();
		
		//step 4:-// entity transaction used to perform transaction management for save / update ,it is used only when we are saving or updating object
		EntityTransaction transaction=entityManager.getTransaction();
		
		transaction.begin();
		
		//step 5:-		
		 //persist methood will  insert Record in table
			/*Person person= entityManager.find(Person.class, 1);
			entityManager .remove(person);*/
		
		 Person updatePerson=     entityManager.find(Person.class, 1000);
		   updatePerson.setFirstName("BP");
		   entityManager.merge(updatePerson);
		
//	entityManager.persist(person);
		
		
		//commit method flush out all data into DB 
		transaction.commit();
		entityManager.close();
		factoryManager.close();
		
	}
}
