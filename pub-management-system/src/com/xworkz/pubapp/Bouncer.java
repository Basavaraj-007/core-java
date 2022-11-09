package com.xworkz.pubapp;

public class Bouncer {

	public void check(int age) throws PubException {
		System.out.println("check method started");
		if(age >= 18) {
			System.out.println("please enter.....Maja maadu");			
		}
		else {
			throw new PubException();			
		}
		System.out.println("check method ended");
	}
}
