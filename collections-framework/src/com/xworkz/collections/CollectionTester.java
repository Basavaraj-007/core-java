package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTester {

	public static void main(String[] args) {
		
		Collection coll = new ArrayList();
		coll.add("Vikrant Rona");
		coll.add("Rocrtry");
		coll.add(1);
		coll.add(true);
		coll.add("Ravi Boppanna");
		
		coll.remove(1);
		
		coll.forEach(System.out::println);

	}

}
