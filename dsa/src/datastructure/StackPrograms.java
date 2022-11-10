package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class StackPrograms {

	public static void main(String []args) {
		
		Stack<Integer> s1 = new Stack<>();
		
		s1.push(5);
		s1.push(9);
		s1.push(4);
		System.out.print(s1);
		
	//	s1.pop();
		//System.out.print(s1);
		
		s1.peek();
		System.out.println(s1.peek());
		
		boolean status = s1.empty();
		System.out.println(status);
		int indexfound=s1.search(6);
		System.out.println(indexfound);
		
		Iterator it =s1.iterator();
		while(it.hasNext()) {
		Object s2=it.next();
		System.out.print(s2);
		}
		System.out.println();
		System.out.println(s1.size());
		
		s1.sort(null);
		System.out.println(s1);
		
	}
}


//advantages:Maintains data in LIFO manner
//2.Last element is readily available for use
//3. all operations are O(1) complexity

