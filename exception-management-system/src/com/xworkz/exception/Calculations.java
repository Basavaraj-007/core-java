package com.xworkz.exception;

public class Calculations {

	public static void amin(String [] args) {
		System.out.println(getAdd(10,20));
		System.out.println(getSub(50,10));
	}
	public static int getAdd(int num1, int num2)
	
	{
	int c= num1 - (-num2);
	return c;
	}
	public static int getSub(int num3, int num4) {
		int c= num3+(~num4+1);
		return c;
	}
}
