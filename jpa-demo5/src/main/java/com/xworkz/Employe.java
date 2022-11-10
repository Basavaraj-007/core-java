package com.xworkz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Employe_table")
public class Employe {

	@Id
	@GeneratedValue
	@Column (name="EMP_ID")
	private int empId;
	@Column(name="EMP_NAME")
	private String name;
	@Column(name="EMP_ADDRESS")
	private String address;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employe [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
}
