package autowiredAnnotationwithxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ap = new ClassPathXmlApplicationContext("autowiredAnnotationwithxml.xml");
		
		Car car = ap.getBean("c",Car.class);
		car.carInformation();
	}

}
