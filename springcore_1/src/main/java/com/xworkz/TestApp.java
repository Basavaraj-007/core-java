package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {

		
		/*
		 * ApplicationContext is sub interface of beanFactory
		 * its creates object by reading spring bean xml(demo.xml) file
		 * 
		 * ApplicationContext will load the xml file and will perform pre-instantiation
		 * (means object creation)
		 * sppring always create single ton object
		 * 
		 * application.ap.getbean
		 */
		
		ApplicationContext a = new ClassPathXmlApplicationContext("demo.xml");
		
		
		//always getBEaan will return Object class
		//we need downcast asper pojo class
		Demo d= (Demo) a.getBean("d"); //pass id from xml
		System.out.println("-----:Message:--"+d.getMsg());
	}

}
