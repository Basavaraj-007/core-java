package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ioc.Airtel;
import ioc.Sim;

public class TestMobile {

	public static void main(String[] args) {

		/*Sim airtel = new Airtel();*/
	
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("simbean.xml");
		
		
		
		Sim airtel = ap.getBean("sim",Airtel.class);
	
		airtel.calling();
		airtel.data();
	}

}
