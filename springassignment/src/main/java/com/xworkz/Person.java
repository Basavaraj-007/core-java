package com.xworkz;


public class Person {

	
	private int pid;
	private String pName;
	private Cars cars;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}

	public Cars getCars() {
		return cars;
	}
	public void setCars(Cars cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pName=" + pName + ", cars=" + cars + "]";
	}

	
	
	
	
}
