package com.xworkz.user.dto;

import java.util.ArrayList;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TestDao {

	public static void main(String[] args) {

		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("teamUnit");
		
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		//State Object
		State Karnataka = new State();
		Karnataka.setName("Karnataka");
		State TamilNadu = new State();
		TamilNadu.setName("TamliNadu");
		State Kerala = new State();
		Kerala.setName("Kerala");
		State LuckNow = new State();
		LuckNow.setName("LuckNow");
		State Maharashtra = new State();
		Maharashtra.setName("Maharashtra");
		// add all states to one arraylist
		//pass states to country
		
		ArrayList<State> states=new ArrayList<State>();
		
		states.add(Kerala);
		states.add(Karnataka);
		states.add(LuckNow);
		states.add(Maharashtra);
		states.add(TamilNadu);
		
		
		//Country
		
		Country India=new Country();
		India.setName("India");
		India.setCode("+91");
		India.setListOfStates(states);
		
		//Team
		
		Team team = new Team();
		team.setName("Team India");
		
		//Player
		
		Player dhoni = new Player();
		dhoni.setCountry(India);
		dhoni.setName("Suresh Raina");//passing country object
		dhoni.setSalary(70000000l);
		dhoni.setTeam(team);//passing team Object
		
		entityManager.persist(Karnataka);
		entityManager.persist(Kerala);
		entityManager.persist(LuckNow);
		entityManager.persist(Maharashtra);
		entityManager.persist(TamilNadu);
		entityManager.persist(India);
		entityManager.persist(team);
		entityManager.persist(dhoni);

		
		
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
		}

}
