package com.xworkz.car;

public class CarFactory{

	public static Car createCar(String carName) {
		
		if(carName=="I20") {
			return new I20();
			
		}
		else if(carName=="Kia") {
			return new Kia();
		}
		
		return null;
		
	}
	
}
