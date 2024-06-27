package ExampleOfCollections;

import java.util.ArrayDeque;

public class Arraydeque {

	public static void main(String[] args) {
		
		ArrayDeque aq=new ArrayDeque();
		aq.add(10);
		aq.offer(20);
		aq.offerFirst(5);
		aq.addFirst(1);
		System.out.println(aq);
		aq.pollLast();
		System.out.println(aq);
		//in this cant travering normall for loop because it does not index

	}

}
