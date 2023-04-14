package com.online.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.bank.dao.CustomerDao;
import com.online.bank.dto.Bank;
import com.online.bank.dto.Customer;
import com.online.bank.util.AccountStatus;
import com.online.bank.util.GenerateAccountNo;
import com.online.bank.util.GenerateCustomerId;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	public CustomerServiceImpl() {
	System.out.println("-----CustomerServiceImpl created------");	
	}
    public static final int MAX_FAILED_ATTEMPTS = 3;
  //  private static final long LOCK_TIME_DURATION = 24 * 60 * 60 * 1000; // 24 hours
    private static final long LOCK_TIME_DURATION = 4 * 60; //

	@Autowired
	private CustomerDao customerDao;
	@Autowired
	private BankService bankService;
	
	public Customer saveCustomer(Customer customer) {
			System.out.println("----saveCustomer---service---");
			customer.setBank((Bank) bankService.findByBankName(customer.getBankName()));
			customer.setAccountNumber(getAccNo());
			customer.setCustomerId(getCusId());
			customer.setStatus(AccountStatus.ACTIVE.toString());
			
		return customerDao.saveCustomer(customer);
	}

	public List<Customer> findByCustomerName(String firstName) {
		System.out.println("----findCustomerByName----service---");
		return customerDao.findByCustomerName(firstName);
	}
	
	public int getAccNo() {
		return GenerateAccountNo.generateAccNo();
	}
	
	public int getCusId() {
		return GenerateCustomerId.generateCustomerId();
	}

	public Customer updateCustomerAddressByName(String firstName, String address) {
		System.out.println("---updateCustomerAddressByName---service---");
		return customerDao.updateCustomerAddressByName(firstName, address);
	}

	public void deleteCustomerDetailsByName(String firstName) {
		customerDao.deleteCustomerDetailsByName(firstName);	
	}

	public Customer loginCustomer(String mailId, String password) {
		Customer customer=customerDao.loginCustomer(mailId, password);
		
		if(customer==null)
		{
			Customer customer2=	findByEmail(mailId);
			if(customer2.getFailAttempts()<=MAX_FAILED_ATTEMPTS)
			{
			     int newFailAttempts = customer2.getFailAttempts() + 1;
				updateFailedAttempts(newFailAttempts, mailId);
				System.out.println(" login Attmetp");
			}
			else if(customer2.getFailAttempts()>=MAX_FAILED_ATTEMPTS)
			{
				customerDao.lockCustomer(mailId);
				 customer=	findByEmail(mailId);

			}
			
		}
		
		return customer;
	}

	public void updateFailedAttempts(int failAttempts, String email) {
		customerDao.updateFailedAttempts(failAttempts, email);
		
	}

	public Customer findByEmail(String email) {
		// TODO Auto-generated method stub
		return customerDao.findByEmail(email);
	}	
	
	   public boolean unlockWhenTimeExpired(String email) {
		   Customer	 customer=	findByEmail(email);

	        long lockTimeInMillis = customer.getLastLoginAttemptDate().getTime();
	        long currentTimeInMillis = System.currentTimeMillis();
	         
	        if (lockTimeInMillis + LOCK_TIME_DURATION < currentTimeInMillis) {     
	            customerDao.unlockCustomer(email);
	             
	            return true;
	        }
	         
	        return false;
	    }
}
