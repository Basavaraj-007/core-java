package com.xworkz.user.util;


	import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

	public class EntityManagerUtil {

		private static EntityManager entityManager;
		
		public EntityManagerUtil(){
			
			 entityManager = Persistence.createEntityManagerFactory("UserUnit").createEntityManager();
		

		}
		
		public static EntityManager getEntityManager() {
			return entityManager;
		}
		
}
