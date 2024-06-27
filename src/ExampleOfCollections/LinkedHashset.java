package ExampleOfCollections;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashset {

	public static void main(String[] args) {
		LinkedHashSet lh=new LinkedHashSet();
		lh.add("10");
		lh.add("20");
		lh.add("40");
		lh.add("30");
		lh.add("10");
		//in this cant adding lement using index but add the element first and last
		lh.addFirst("0");
		lh.add("bat");
		lh.add("tab");
		//it maintain the order of insertion
		System.out.println(lh);

		
		Iterator itr=lh.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	
		
	}
	
	

}
