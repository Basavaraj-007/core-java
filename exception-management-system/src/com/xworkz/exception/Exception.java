package com.xworkz.exception;

public class Exception {

	public static void main(String[] args) {
		System.out.println("main method started");
		// handling exception using try and catch block
		try {
			System.out.println("Inside try block");
			String string ="Gangadhar";
			System.out.println(string.indexOf('a'));
			System.out.println("End of try block");
		}catch(NullPointerException e) {
			System.out.println("Cannot access the null object");
			
		}
			System.out.println("main mathod ended");
			
			try {
				System.out.println("Inside try block");
			int []numbers = {1,2,3,4,5,6};
			for(int i=0;i<numbers.length;i++) {
				System.out.println(numbers[5]);
			}
			System.out.println("End of try block");
		}catch(NullPointerException e) {
			System.out.println("Cannot access the null object");
			
			
			
			}
	}
}
