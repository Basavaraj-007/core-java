package com.xworkz;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="collage")

public class Collage {

	private int cid;
	private String name;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Students> listOfStudents;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Students> getListOfStudents() {
		return listOfStudents;
	}
	public void setListOfStudents(List<Students> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}
	@Override
	public String toString() {
		return "Collage [cid=" + cid + ", name=" + name + "]";
	}
	
	
	
}
