package ExampleOfCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Arraylis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List al=new ArrayList();
		al.add(10);
		al.add("Student");
		al.add(5.9);
		al.add(true);
		al.add(2, "r");
		
		
		System.out.println(al.size());
		
		System.out.println(al.get(1));
		
		System.out.println(al);
		
		System.out.println(al.remove(2));
		
		System.out.println(al.removeFirst());
		
		System.out.println(al);
		

		
		
		List al1=new ArrayList();
		al1.addAll(al);
		
		System.out.println(al1);
		al1.addAll(2, al);
		
		
		System.out.println(al1);
		
		//Traversing using Iterator class
		ListIterator it=al1.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//traversing iterator in reverse order
		ListIterator it1=al1.listIterator(al1.size());
		
				while(it1.hasPrevious())
				{
					System.out.println(it1.previous());
				}
		
		System.out.println(al1.isEmpty());
		al1.clear();
		System.out.println(al1);
		System.out.println(al1.isEmpty());
		
		
		
	}

	

}
