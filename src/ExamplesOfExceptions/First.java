package ExamplesOfExceptions;

public class First {
	public void a() {
		System.out.println("In class first a method");
		
		b();
	}
	
	public void b() {
		System.out.println("In class First b method");
		div();
		
	}

	public void div() {
		int a=15,b=0;
		int c=a/b;
		System.out.println(c);
		
		
	}

}
