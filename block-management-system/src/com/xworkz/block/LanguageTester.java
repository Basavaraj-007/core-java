package com.xworkz.block;

public class LanguageTester {

	public static void main(String[] args) {
	System.out.println("Main method started");
	try {
	String i = "raj";
	
	int i1= Integer.parseInt(i);
	
	System.out.println("After converting" +i1);
	}catch (Exception e) {
		e.printStackTrace();;
		System.out.println("the format is mismatch");
	}
	int i2= 55542;
	System.out.println("Main method ended" +i2);
	}
	public static void m1() {
	String contactNo="8795665558";
	try {
		Long.parseLong(contactNo);
		
	}catch (NumberFormatException e) {
		e.printStackTrace();
		System.out.println("Pleasae provide valid contactNo");
		
	}catch(ArithmeticException ae)
	{
		ae.printStackTrace();
	}
	}
	/*	int a=20;
		int b=5;
		System.out.println("Add :" + Math.addExact(a, b));
		System.out.println("Sub :" + Math.subtractExact(a, b));
		System.out.println("Mul :" + Math.multiplyExact(a, b));
		System.out.println("Div :" + Math.floorDiv(a, b));*/

	
	}
	/*	LanguageDTO lang = new LanguageDTO();
		lang.setId(150);
		lang.setContactNo(9632587412L);
		lang.setDNum(2.00);
		lang.setNum((short) 225);
		lang.setCons('g');
		

		//converting to wrapper class - boxing
		Integer id = lang.getId();
		//auto-unboxing
		int id1 = id;
		//Conversion from wrapper to primitive - unboxing
		int id2 = id.intValue();
		//auto-boxing
		Long contactNo = lang.getContactNo();
		//unboxing
		long contactNo1 = contactNo.longValue();
		//auto-boxing
		Double dNum = lang.getDNum();
		//unboxing
		double dNum1 = dNum.doubleValue();
		//auto-boxing
		Short num = lang.getNum();
		//unboxing
		double num1 = num.shortValue();
		

		System.out.println(lang.getId()+ " "+ lang.getContactNo()+" "+lang.getCons()+"  "+lang.getDNum());
		System.out.println(id1+ ""+id2+" "+contactNo1+" "+num);
	}*/
	
	
	
	
