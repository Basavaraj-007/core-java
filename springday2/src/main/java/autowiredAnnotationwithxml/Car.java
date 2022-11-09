package autowiredAnnotationwithxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//example for @Autowired with xml configuration
public class Car {
@Autowired
@Qualifier ("i20")
	private Engine e;
	
	public void carInformation() {
	
		System.out.println("----Car Info----"+e.toString());
		
	}
}
