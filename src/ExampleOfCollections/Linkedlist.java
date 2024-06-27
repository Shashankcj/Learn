package ExampleOfCollections;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		
		l.add(10);
		l.add("a");
		l.add("c");
		System.out.println(l);
		//linked list is best for storing element at intermediate or firstend
		l.add(2, "b");
		l.addFirst("alpabet");
		l.addLast("z");
		System.out.println(l);
		

		//in linked list we can't give the capacity
		//List l1=new LinkedList(10);
		
		LinkedList l1=new LinkedList();
		l1.add("10");
		l1.add("20");
		l1.add("90");
		l1.add("10");
		//it retrive the first element or peekFirst()
		System.out.println(l1.peek());
		System.out.println(l1.peekLast());
		//it retrive the first element and remove from the list or pollFirst()
		System.out.println(l1.poll());
		
		//it give the last occurence of same element
		System.out.println(l1.lastIndexOf(10));
		System.out.println( l1.removeLastOccurrence("10"));
		System.out.println(l1);
		
		Object a[]=l1.toArray();
		System.out.println(a[0]);
	}

}
