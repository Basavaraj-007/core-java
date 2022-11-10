package com.xworkz.user.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="country")
public class Country {

	@Id
	@GeneratedValue
	private int cid;
	private String name;
	@OneToMany(cascade = CascadeType.ALL)
	private List<State> listOfStates;
	private String code;
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
	public List<State> getListOfStates() {
		return listOfStates;
	}
	public void setListOfStates(List<State> listOfStates) {
		this.listOfStates = listOfStates;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Country [cid=" + cid + ", name=" + name + ", code=" + code + "]";
	}
	
	
	
}
