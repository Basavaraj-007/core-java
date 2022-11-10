package springAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ap = new AnnotationConfigApplicationContext(TestConfig.class);
		
		Car car = ap.getBean(Car.class);
		System.out.println(car);
		//car.carInformation();
		
	}

}
