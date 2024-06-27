package ExampleOfCollections;

import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		
		
		PriorityQueue pq=new PriorityQueue();
		pq.add(90);
		pq.add(10);
		pq.add(40);
		pq.offer(5);
		//it remove first element
		//pq.remove();
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		
	}

}
