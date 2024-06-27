package ExampleOfHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example2 {
	public static void main(String [] args) {
		
		Map<String, String> m=new HashMap<String, String>();
		m.put("A", "a");
		m.put("B", "b");
		m.put("C", "c");
		System.out.println(m);
		for(Map.Entry<String, String> a:m.entrySet())
			System.out.println(a.getKey()+" "+a.getValue());
//		m.clear();
//		System.out.println(m);
		Map<String, String> n=new HashMap<String, String>();
		System.out.println(m.equals(n));
		
		System.out.println(m.remove("C"));
		System.out.println(m);
		
		System.out.println(m.remove("A", "a"));
		System.out.println(m);
		
		System.out.println(m.replace("B", "a"));
		System.out.println(m);
		
		System.out.println(m.replace("B", "a", "b"));
		System.out.println(m);
		
		System.out.println(m.get("B"));
		
		
		System.out.println(m.keySet());
		
		System.out.println( m.values());
		
		System.out.println(m.containsKey("B"));
		
		System.out.println(m.size());
		
		
	}

}
