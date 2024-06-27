package ExamplesOfExceptions;

public class PropogationException {

	public static void main (String[] args) {
		try
		{
			a();
		
		}
		catch (Exception e) {
			e.getLocalizedMessage();
			
		}
		

	}
	public static void a() {
		System.out.println("a method is calling");
		b();
	}
	
	public static void b() {
		System.out.println("b method is calling");
		c();
	}
	
	public static void c() {
		System.out.println("c method is calling");
		d();
	}
	
	public static void d() {
		System.out.println("d method is calling");
		e();
	}
	
	public static void e() {
		System.out.println("e method is calling");
		f();
	}
	
	public  static void f() {
		System.out.println("f method is calling");
		g();
	}
	
	public static void g() {
		System.out.println("g method is calling");
		h();
	}
	
	public static void h() {
		System.out.println("h method is calling");
		i();
	}
	
	public static void i() {
		System.out.println("i method is calling");
		j();
	}
	
	public static void j() {
		System.out.println("j method is calling");
		div();
	}
	
	public static void div() {
		int a=10,b=0;
		int c=a/b;
	}
}
