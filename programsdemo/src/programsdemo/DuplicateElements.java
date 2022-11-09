package programsdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strList= new ArrayList<String>();
		strList.add("Raj");
		strList.add("Basava");
		strList.add("MSD");
		strList.add("MSDhoni");
		strList.add("Raj");
		strList.add("MSD");
		
		System.out.println("=======Elements before duplicate remove===="+strList.size());
		for(String str:strList)
			System.out.println(str);
		
		//convert arraylist to hashset
		Set set=new HashSet(strList);
		//convert hashset to arraylist
		strList =new ArrayList(set);
		
		System.out.println("=======Elements after duplicate remove===="+strList.size());
		for(String str:strList)
			System.out.println(str);
	}

}
