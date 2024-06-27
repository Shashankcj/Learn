package ExampleOfCollections;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		
		//it effecint for remove,search and add consume O(log(N))
		//it is efficient for sorting largedata, it use binary balance tree
		TreeSet<String> t=new TreeSet<String>();
		t.add("10");
		t.add("20");
		t.add("30");
		t.add("50");
		t.add("60");
		t.add("70");
		t.add("80");
		t.add("90");
		//in tree set we cant add first,last intermediate
		//t.addFirst("5");
		
		//reverse the set
		System.out.println(t.descendingSet());
		
		System.out.println(t.headSet("60"));
		System.out.println(t.tailSet("30"));
		System.out.println(t.tailSet("30",false));
		
		System.out.println(t.subSet("10", "50"));
		System.out.println(t);

	}

}
