package com.xworkz.team.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class EntityManagerUtil {

private static EntityManager entityManager;
	
	public EntityManagerUtil(){
		
		 entityManager = Persistence.createEntityManagerFactory("TeamUnit").createEntityManager();
	

	}
	
	public static EntityManager getEntityManager() {
		return entityManager;
	}
	
}
