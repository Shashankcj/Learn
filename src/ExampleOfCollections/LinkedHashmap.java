package ExampleOfCollections;

import java.util.HashMap;

public class LinkedHashmap {

	public static void main(String[] args) {
		 
		HashMap<String, Integer> m=new HashMap<String, Integer>();
		m.put("a",1);
		m.put("b",2);
		m.put("c",3);
		System.out.println(m);
		
		m.put("a", 4);
		System.out.println(m);
		
	}

}
