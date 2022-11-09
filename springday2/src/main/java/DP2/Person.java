package DP2;

import java.util.List;

public class Person {

	/*public Person() {
		System.out.println("------------Inside person class----------");
	}*/
	
	private int id;
	private String name;
	private List<Car> listOfCars;
	public Person(int id, String name, List<Car> listOfCars) {
		super();
		this.id = id;
		this.name = name;
		this.listOfCars = listOfCars;
	}
	public void displayPerson() {
		System.out.println("Id :"+this.id);
		System.out.println("Name :"+this.name);
		System.out.println("List Of Cars :"+this.listOfCars);
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", listOfCars=" + listOfCars + "]";
	}

	
}
