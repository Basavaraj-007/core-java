package com.xworkz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestMain2 {

	public static void main(String[] args) {

		//step 1:- create entity object and set values using setter and set the values
		
			/*Collage collage =new Collage();
				collage.setId(01);
				collage.setCollageName("Sharadha");
				collage.setYearOfEstablished(1970);
				collage.setCollageAddress("Marthalli");
				collage.setCollageContactNo(968696869);*/
					
					
					
					
					/*person.setId(900);
					person.setFirstName("Bullet");
					person.setLastName("Bhaskar");*/
					
					//step 2:-
					EntityManagerFactory factoryManager=	Persistence.createEntityManagerFactory("Collage_xworkz");
					
					//step 3:-
					EntityManager entityManager = factoryManager.createEntityManager();
					
					//step 4:-
					EntityTransaction transaction=entityManager.getTransaction();
					
					transaction.begin();
					
					//step 5:-		
					 //persist methood will  insert Record in table
					
					
					
				/*	Collage collage = entityManager.find(Collage.class, 1);
					entityManager .remove(collage);*/
					
					 Collage updateCollage=     entityManager.find(Collage.class,1);
					   updateCollage.setCollageName("Manikya");
					   entityManager.merge(updateCollage);
					
					//entityManager.persist(collage);
					
					//commit method flush out all data into DB 
					transaction.commit();
					entityManager.close();
					factoryManager.close();
					
					
					
					
				}
		
	}


