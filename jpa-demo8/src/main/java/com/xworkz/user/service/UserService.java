package com.xworkz.user.service;


	import java.util.List;

import com.xworkz.user.dto.User;
import com.xworkz.user.util.EntityManagerUtil;

import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

	public class UserService implements UserIntf{

		EntityManagerUtil entityManagerUtil = new EntityManagerUtil();
		
		public void saveUser(User user) {
			EntityTransaction entityTransaction = EntityManagerUtil.getEntityManager().getTransaction();
			entityTransaction.begin();
			EntityManagerUtil.getEntityManager().persist(user);

			entityTransaction.commit();
			EntityManagerUtil.getEntityManager().close();
		}

		public User findUserById(int userId) {
			Query query=	EntityManagerUtil.getEntityManager().createNamedQuery("findUserById");
			query.setParameter("id", userId);
			List<User> listUser= query.getResultList();
			System.out.println("------ count of list--"+listUser.size());
				User retUser=null;
				for(User user : listUser)
				{
					retUser=user;

				}
			return retUser;
		}

		public User deleteUserById(int userId) {
			Query query=	EntityManagerUtil.getEntityManager().createNamedQuery("deleteUserById");
			query.setParameter("id", userId);
			List<User> listUser= query.getResultList();
			System.out.println("------ count of list--"+listUser.size());
				User retUser=null;
				for(User user : listUser)
				{
					retUser=user;

				}
			return retUser;
		}

		public User loginUser(String email, String password) {
			// TODO Auto-generated method stub
			return null;
		}

		public User updateUser(User user) {
			// TODO Auto-generated method stub
			return null;
		}

		public User findByUserEmail(String email)
{
			//select*from user where email=? and password=?
		Query query=	EntityManagerUtil.getEntityManager().createNamedQuery("findByUserEmail");
		
		// setting parameter for jpql query
		
		query.setParameter("email", email);
		
		//for encryption of password
	//	 BCryptPasswordEncoder encoder =new BCryptPasswordEncoder();
		//query.setParameter("password", encoder.encode(password));	

		
		List<User> listUser= query.getResultList();
	System.out.println("------ count of list--"+listUser.size());
		User retUser=null;
		for(User user : listUser)
		{
			
			retUser=user;
		}
	return retUser;
			
			}
}
