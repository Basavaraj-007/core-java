package com.xworkz.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer  extends User{

//	@Id
//	@GeneratedValue
//	private int id;
	private String govt_id;
	@Column(unique = true)
	private String accountNumber;
	@Column(unique = true)
	private String customerID;
	private Double balance;
	@OneToOne
	private Bank bank;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
	public String getGovt_id() {
		return govt_id;
	}
	public void setGovt_id(String govt_id) {
		this.govt_id = govt_id;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "Customer [ govt_id=" + govt_id + ", accountNumber=" + accountNumber + ", customerID="
				+ customerID + ", balance=" + balance + ", bank=" + bank + "]";
	}
}
