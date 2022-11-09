package com.xworkz;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionInfo {

	private List<String> names;
	private List<Person> personList;
	private Set<Person> personSet;
	private Map<Person,Cars> personCarsMap;
	private Person personArray[] = new Person[2];
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public List<Person> getPersonList() {
		return personList;
	}
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
	
	public Set<Person> getPersonSet() {
		return personSet;
	}
	public void setPersonSet(Set<Person> personSet) {
		this.personSet = personSet;
	}
	public Map<Person, Cars> getPersonCarsMap() {
		return personCarsMap;
	}
	public void setPersonCarsMap(Map<Person, Cars> personCarsMap) {
		this.personCarsMap = personCarsMap;
	}
	public Person[] getPersonArray() {
		return personArray;
	}
	public void setPersonArray(Person[] personArray) {
		this.personArray = personArray;
	}
}
