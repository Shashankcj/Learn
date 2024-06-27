package ExampleOfCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("shashank");
		hs.add("Theertha");
		hs.add("hithu");
		hs.add("");
		System.out.println(hs);
		
		
		List al=new ArrayList();
		al.add(10);
		al.add("Student");
		al.add(5.9);
		al.add(true);
		al.add(2, "r");
		
		
		HashSet<String> hs1=new HashSet<String>();
		hs1.addAll(al);
		//in hashset we cant add element using index
		hs1.add("na");
	
		System.out.println(hs1);
		
	}

}
