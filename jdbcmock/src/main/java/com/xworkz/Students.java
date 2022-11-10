package com.xworkz;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Students {

	@javax.persistence.Id
	@javax.persistence.GeneratedValue
	private int sid;
	private String name;
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
		return "Students [sid=" + sid + ", name=" + name + "]";
	}
	
	
}
