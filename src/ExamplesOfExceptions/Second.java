package ExamplesOfExceptions;

public class Second {
	public void a() {
		System.out.println("In class second a method");
		
		b();
	}
	
	public void b() {
		System.out.println("In class second b method");
		div();
		
	}

	public void div() {
		int a=10,b=0;
		int c=a/b;
		System.out.println(c);
		
		
	}

	
}
