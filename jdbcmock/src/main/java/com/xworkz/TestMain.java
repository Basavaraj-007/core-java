package com.xworkz;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class TestMain {

	public static void main(String[] args) {


		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Students Raj = new Students();
		Raj.setName("Raj");
		Students Gowda = new Students();
		Gowda.setName("Gowda");
		Students Nikhil = new Students();
		Nikhil.setName("Nikhil");
		
		// add all states to one arraylist
		//pass states to country
		
		ArrayList<Students> std=new ArrayList<Students>();
		
		std.add(Raj);
		std.add(Gowda);
		std.add(Nikhil);

		
		Collage Sharadha=new Collage();
		Sharadha.setName("Sharadha");
		Sharadha.setListOfStudents(std);
		
		Students st = new Students();
		st.setName("Raj");
		
		entityManager.persist(Raj);
		
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
		
		
	}

}
