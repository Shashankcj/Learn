package ExampleOfHashMap;

import java.util.HashMap;
import java.util.Map;

public class Example1 {

	public static void main(String[] args) {
		
		Map<Integer,String> m=new HashMap<Integer, String>();
		/*when call the put method internally it calls hashcode
		 it generates hashcode for the key object
		 the it calculate the index of array of nodes using index method
		 after it calls equals method it checks the inserted key and if any stored 
		 is present any key is not stored in bucket then it store the 
		 with int hash,k key,v value,node next(null)
		 */
		m.put(1, "A");
//		m.put(2, "B");
		m.put(1, "A");
		m.put(null, "C");
		
		
//		m.put(3, "C");
//		m.put(4, "D");
		/* when put method is calling again with the same key with
		  different value then it call same as previous method hashcode()
		  index(),equal() but this it checks inserted key and stored bucket key both 
		  are same so it replace the old value with new value with the same 
//		  bucket  */
//		String a=m.put(1, "S");
//		System.out.println(a);
		 
		System.out.println(m);
//		for(Map.Entry map:m.entrySet()) {
//			System.out.println(map.getKey()+" "+map.getValue());
//			
//}			
		
	}

}
