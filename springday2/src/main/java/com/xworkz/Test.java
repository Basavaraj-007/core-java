package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ApplicationContext a = new ClassPathXmlApplicationContext("studentbean.xml");
		
		
		//always getBEaan will return Object class
		//we need downcast asper pojo class
		Student s= (Student) a.getBean("s"); //pass id from xml
		System.out.println("id :"+s.getId());
		System.out.println("name :"+s.getName());
		System.out.println("rollNo :"+s.getRollNo());

	}

}
