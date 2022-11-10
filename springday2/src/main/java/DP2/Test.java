package DP2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("DP2bean.xml");
		
		
		Person p = ap.getBean("raj",Person.class);
		p.displayPerson();
		System.out.println("---------------------------------------");
		
		Car ciaz=ap.getBean("ciaz",Car.class);
		ciaz.displayCar();
		System.out.println("---------------------------------------");

		
		Car audi=ap.getBean("audi",Car.class);
		audi.displayCar();
		
		
	}

}
