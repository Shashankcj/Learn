package oopsConcept;

public class MultilevelInheritence extends second {
	
	public void Third() {
		System.out.println("This is a third method");
		
	}
	
	public static void main(String[] args) {
		
		MultilevelInheritence mi=new MultilevelInheritence();
		mi.first();
		mi.second();
		mi.Third();
		
	}

}


class First{
	
	public void first() {
		System.out.println("This is first class");
		
	}
}

class second extends First
{
	public void second() {
		System.out.println("This is a second class");
		
	}
}

