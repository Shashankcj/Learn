package oopsConcept;

public class ExampleOfAbstraction {

	public static void main(String[] args) {
		
		Circle1 c=new Circle1();
		c.calculateArea();
		c.calculatePerimeter();
		
	}
	
	

}

abstract class Shape1{
	//Abstract method
	abstract public void calculateArea();
	
	//Concrete method
	public void calculatePerimeter()
	{
		System.out.println("Calculating the  perimeter");
	}
	
	
}

class Circle1 extends Shape1{

	@Override
	public void calculateArea() {
		System.out.println("Calculating the area");
		
	} 
	
}