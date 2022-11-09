package com.xworkz.collections;

import java.util.ArrayList;
import java.util.List;

public class InterfaceMethodsTester {

	public static void main(String[] args) {
		
		List al = new ArrayList();
		
//		System.out.println(al.isEmpty());

		al.add(100);
		al.add("Basava");
		al.add(23);
		al.add("Siruguppa");
		
//	System.out.println(al.add("ABC"));
		
		//al.remove(2);
		//al.clear();
	System.out.println(al);
	//System.out.println(al.size());


	//System.out.println(al.isEmpty());

	//System.out.println(al.contains("Bellary"));
	
	ArrayList al2 =new ArrayList();
	
	al2.add("- My  Friends");
	al2.add("Ck Gowda");
	al2.add("Praveen");
	al2.add("Basava Kolor");
	
	System.out.println(al2);

	
	//al.removeAll(al2);
	//System.out.println(al);

	//System.out.println(al2);
	//System.out.println(al2.size());
	
	
	al.addAll(al2);
	
	System.out.println(al);
	
	al.retainAll(al2);
	System.out.println(al);

//System.out.println(al2);

	
	}
}
