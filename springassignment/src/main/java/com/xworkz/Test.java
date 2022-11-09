package com.xworkz;


import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	CollectionInfo collectionInfo = applicationContext.getBean(CollectionInfo.class);
	
	System.out.println("getNames-----------");
	List<String>names=collectionInfo.getNames();
	names.forEach(System.out::println);
	
	System.out.println("getPersonList------------");
	List<Person> personList=collectionInfo.getPersonList();
	personList.forEach(System.out::println);
	
	System.out.println("getPersonSet------------------------------");
	Set<Person> personSet = collectionInfo.getPersonSet();
	personSet.forEach(System.out::println);
	
	System.out.println("getPersonCarsMap------------");
	Map<Person,Cars> personCarsMap = collectionInfo.getPersonCarsMap();
	personCarsMap.forEach((person,cars)->{
		System.out.println(person);
		System.out.println(cars);
	});
	
	System.out.println("getPersonArray-----------");
	Person[] personArray = collectionInfo.getPersonArray();
	for(Person person : personArray) {
		System.out.println(person);
	}
	}
	
		
		
		
	

}
