package oopsConcept;

public class MethodOverriding {

	public static void main(String[] args) {
		
		Dog d=new Dog();
		//calling inherited method
		d.bike();
		//calling override method
		d.animal();
		//calling child specifid method
		d.cat();
		
		
	}

}

class Animal
{
	//inherited method
	public void bike() {
		System.out.println("Ram is riding a ");
		
	}
	
	public void animal() {
		System.out.println("Animal is walking");
		
	}
	
	
}

class Dog extends Animal{
	
	
	//overriding method
	@Override
	public void animal() {
		System.out.println("Dog is walking");
		
	}
	
	// child specified method
	public void cat() {
		System.out.println("cat is walking");
		
	}
	
}