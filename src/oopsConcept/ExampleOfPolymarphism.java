package oopsConcept;

public class ExampleOfPolymarphism {

	public static void main(String[] args) {
		
		
	Shape s=new Circle();
	Shape r=new Rectangle();
	
	ExampleOfPolymarphism ep=new ExampleOfPolymarphism();
	ep.doActiviry(s);
	ep.doActiviry(r);
	}
	
	public void doActiviry(Shape s) {
		System.out.println(s.calculateArea());
		System.out.println(s.calculatePerimete());
		//Downcasting
		if(s instanceof Circle)
		((Circle)s).drawCircle();
		else if(s instanceof Rectangle)
		((Rectangle)s).drawRect();
		
		
	}
}

class Shape{
	public String calculateArea() {
		return "Calculating the area";	
	}
	
	public String calculatePerimete() {
		return null;
		
	}
}

class Circle extends Shape{
//	public String calculateArea() {
//		return "Calculting the area of circle";	
//	}
//	
	public String calculatePerimete() {
		return "Calculting the Perimeter of circle";
		
	}
	//Child specified method
	public void drawCircle() {
		System.out.println("This is a child specified method of circle");
		
	}
	
}

class Rectangle extends Shape{
//	public String calculateArea() {
//		return "Calculting the area of rectangle";	
//	}
	
	public String calculatePerimete() {
		return "Calculting the Perimeter of rectangle";
		
	}
	//Child specified method
	public void drawRect() {
		System.out.println("This is a child specified method of rectangle");
		
	}
	
}
