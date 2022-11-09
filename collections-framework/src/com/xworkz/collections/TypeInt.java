package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TypeInt {

	
public static void main(String args[]) {
		
		Collection coll = new ArrayList();
		coll.add(2);
		coll.add(7);
		coll.add(1);
		coll.add(2);
		coll.add(1);
		coll.add(9);
		coll.add(9);
		coll.add(7);
		coll.add(0);
		coll.add(0);
		
		coll.forEach(System.out::println);
		
	}

}

