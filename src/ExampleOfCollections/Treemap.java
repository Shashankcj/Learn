package ExampleOfCollections;

import java.util.TreeMap;

public class Treemap {
	public static void main(String[] args) {
		TreeMap<Integer, String> t=new TreeMap<Integer, String>();
		
		
		//when put methon call it internall check the key object 
		//with equal method if it present before then old value 
		//is return and replace with new value otherwise it return null
		//and it map with key and value with node
		
		
		t.put(1, "A");
		t.put(1, "A");
		
		//The treemap used for  binary serach
		//it use the black and red balance binary search
		
		t.put(2, "B");
		t.put(1, "C");
		t.put(2, "D");
		
		System.out.println(t);
		//in tree map we cant add first , last and also intermediate
		//t.putFirst(10, "E");
		t.remove(1);
		System.out.println(t);
		
	}
}
