package com.xworkz.collections;

/*import java.util.ArrayList;
import java.util.Collection;

public class TypeString {
	
	public static void main(String a[]) {
		
		Collection coll = new ArrayList();
		
		coll.add("Basavaraj");
		coll.add("Bellary");
		coll.add("Banglore");
		coll.add("Happy");
		coll.add("Java");
		coll.add("Css");
		coll.add("Html");
		coll.add("JavaScript");
		coll.add("SQL");
		coll.add("JavaAdvance");
		
		boolean check = coll.containsAll(coll);
		System.out.println(check);
		
		//coll.clear();
		System.out.println(coll);
		coll.forEach(System.out::println);
		
		

		Collection coll1 = new ArrayList();
			coll1.addAll(coll1);
		coll1.add("Bangalore");
		coll1.add("Hiriyur");
		coll1.add("Siruguppa");
		coll1.add("Sindhanoor");
		coll1.containsAll(coll1);
		//boolean check1 = coll1.removeAll(coll);
		System.out.println(coll1);

		System.out.println("//// array example");
		int i[] = {1,2,3};
		System.out.println(i);
	}


	}*/

import java.util.*;
public class TypeString {
public static void main(String[] course) throws Exception
{
try {
List<String> courselist = new ArrayList<String>();
courselist.add("Data Science");
courselist.add("Data Engineering");
courselist.add("Data Analyst");
courselist.add("Data Mining");
System.out.println("\n New Course List with course name : \n" + courselist);
boolean price = Collections.addAll(courselist, "22590", "23490", "34590", "54590");
System.out.println("\n Status of the courses on Website : \n" + price);
System.out.println("\n New Courses with their respective prices : \n" + courselist);
}
catch (NullPointerException upcomingcourse) {
System.out.println("Upcoming Courses are : " + upcomingcourse);
}
catch (IllegalArgumentException upcomingcourse) {
System.out.println("Upcoming Courses are : " + upcomingcourse);
}
}
}


