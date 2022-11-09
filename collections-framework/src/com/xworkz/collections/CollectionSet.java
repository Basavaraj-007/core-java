package com.xworkz.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		set.add("Bangalore");
		set.add("Bellary");
		set.add("Siruguppa");
		set.add("Tumkur");
		set.add("Hubbali");
		
		
		
		set.forEach(System.out::println);
	}
	
}
