package com.xworkz.user.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="state")

public class State {
	@Id
	@GeneratedValue
	private int sid;
	private String name;
	//@manytoOne
	//Country country
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "State [sid=" + sid + ", name=" + name + "]";
	}
	
	
}
