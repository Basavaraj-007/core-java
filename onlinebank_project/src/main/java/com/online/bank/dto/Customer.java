package com.online.bank.dto;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
public class Customer extends User {

	//@Id
	//@GeneratedValue
	//private int id;
	@Column(unique = true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int customerId;
	private String govtId;
	@Column(unique = true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int accountNumber;
	private double initialDeposit;
	@OneToOne
	private Bank bank;
	private String bankName;
	private String typeOfAccount;
	private String status;
	private int failAttempts;
	private Date lastLoginAttemptDate;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getGovtId() {
		return govtId;
	}
	public void setGovtId(String govtId) {
		this.govtId = govtId;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getInitialDeposit() {
		return initialDeposit;
	}
	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getTypeOfAccount() {
		return typeOfAccount;
	}
	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getFailAttempts() {
		return failAttempts;
	}
	public void setFailAttempts(int failAttempts) {
		this.failAttempts = failAttempts;
	}
	public Date getLastLoginAttemptDate() {
		return lastLoginAttemptDate;
	}
	public void setLastLoginAttemptDate(Date lastLoginAttemptDate) {
		this.lastLoginAttemptDate = lastLoginAttemptDate;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", govtId=" + govtId + ", accountNumber=" + accountNumber
				+ ", initialDeposit=" + initialDeposit + ", bank=" + bank + ", bankName=" + bankName
				+ ", typeOfAccount=" + typeOfAccount + ", status=" + status + ", failAttempts=" + failAttempts
				+ ", lastLoginAttemptDate=" + lastLoginAttemptDate + "]";
	}
	
	
	
}
