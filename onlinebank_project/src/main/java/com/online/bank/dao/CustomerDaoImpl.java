
package com.online.bank.dao;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.online.bank.dto.Customer;
import com.online.bank.util.AccountStatus;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	public CustomerDaoImpl() {
		System.out.println("-----CustomerDaoImpl created-----");
	}
	
@Autowired
private EntityManagerFactory factory;
private EntityManager manager = null;

public Customer saveCustomer(Customer customer) {
		boolean isCustomerSaved=false;
		try {
		manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(customer);
		transaction.commit();		
		System.out.println("------Employee Saved------");
		isCustomerSaved =true;
		}
		catch (Exception e) {
		e.printStackTrace();
		}finally {
			manager.close();
//			factory.close();
		}		
		//validation
		return isCustomerSaved ? customer : null;
	}

public List<Customer> findByCustomerName(String firstName) {
		List<Customer> listCustomer = null;
		System.out.println("-----findCustomer---dao");
		try {			
			manager = factory.createEntityManager();
			Query query= manager.createQuery("SELECT b FROM Customer b WHERE b.firstName=:firstName");
			query.setParameter("firstName",firstName);
			
			 listCustomer = query.getResultList();
			
			 System.out.println("----CustomerName----"+listCustomer);
			
		} catch (NoResultException e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		return listCustomer;
	}

public Customer updateCustomerAddressByName(String firstName, String address) {
		System.out.println("----updateCustomerAddressByName----customerDao---");
		String updateJpql="update Customer b set b.address=:address where b.firstName=:firstName";
		
		try {			
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();			
			Query query = manager.createQuery(updateJpql);
			query.setParameter("firstName", firstName);
			query.setParameter("address", address);
		int count =	query.executeUpdate();
			
			transaction.commit();			
			System.out.println("---Address updated successfully---"+count);
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
			manager.close();
		}
		return null;
	}

	public void deleteCustomerDetailsByName(String firstName) {
		System.out.println("---deleteCustomerDetailsByFirstName---CustomerDao---");
		//String deleteQry= "delete from Customer b where b.firstName=:firstName";
			try {			
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Query query=manager.createQuery("delete from Customer b where b.firstName=:firstName");
			query.setParameter("firstName", firstName);
			int count = query.executeUpdate();
			transaction.commit();
			System.out.println("Customer details deleted---"+count);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		
	}

	public Customer loginCustomer(String mailId, String password) {
	Customer listCustomer = null;
		System.out.println("-----loginCustomer---dao");
		try {			
			manager = factory.createEntityManager();
			Query query= manager.createQuery("SELECT b FROM Customer b WHERE b.mailId=:mailId and b.password=:password");
			query.setParameter("mailId",mailId);
			query.setParameter("password",password);
			 listCustomer = (Customer) query.getSingleResult();
			
			 System.out.println("----CustomerName----"+listCustomer);
			
		} catch (NoResultException e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		return listCustomer;
	}

	public void updateFailedAttempts(int failAttempts, String email) {
		System.out.println("----updateCustomerAddressByName----customerDao---");
		String updateJpql="update Customer b set b.failAttempts=:failAttempts, b.lastLoginAttemptDate=:lastLoginAttemptDate  where b.mailId=:mailId";
		
		try {			
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();			
			Query query = manager.createQuery(updateJpql);
			query.setParameter("failAttempts", failAttempts);
			query.setParameter("mailId", email);
			query.setParameter("lastLoginAttemptDate", new Date());

		int count =	query.executeUpdate();
			
			transaction.commit();			
			System.out.println("---updateFailedAttempts updated successfully---"+count);
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
			manager.close();
		}
		
	}

	public Customer findByEmail(String email) {
		Customer listCustomer = null;
		System.out.println("-----findByEmail---dao");
		try {			
			manager = factory.createEntityManager();
			Query query= manager.createQuery("SELECT b FROM Customer b WHERE b.mailId=:mailId");
			query.setParameter("mailId",email);
			
			 listCustomer = (Customer) query.getSingleResult();
			
			 System.out.println("----findByEmail----"+listCustomer);
			
		} catch (NoResultException e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		return listCustomer;
	}

	public void lockCustomer(String email) {
		System.out.println("----updateCustomerAddressByName----customerDao---");
		String updateJpql="update Customer b set b.status=:status where b.mailId=:mailId";
		
		try {			
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();			
			Query query = manager.createQuery(updateJpql);
			query.setParameter("mailId", email);
			query.setParameter("status", AccountStatus.INACTIVE.toString());

		int count =	query.executeUpdate();
			
			transaction.commit();			
			System.out.println("---lockCustomer updated successfully---"+count);
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
			manager.close();
		}
		
		
	}

	public boolean unlockCustomer(String email) {
		System.out.println("----updateCustomerAddressByName----customerDao---");
		String updateJpql="update Customer b set b.status=:status where b.mailId=:mailId";
		int count =0;
		try {			
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();			
			Query query = manager.createQuery(updateJpql);
			query.setParameter("mailId", email);
			query.setParameter("status", AccountStatus.ACTIVE.toString());

		 count =	query.executeUpdate();
			
			transaction.commit();			
			System.out.println("---unlockCustomer updated successfully---"+count);
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
			manager.close();
		}
		return count==1?true :false;
		
		
	}

}
