package oopsConcept;

public class InitializeByConstructor {
	
	String name;
	int age;
	
	public InitializeByConstructor(int age,String name)
	{
		this.age=age;
		this.name=name;
		//inside a constructor call method
		display();
		
		
		
	}

	public void display() {
		System.out.println(name+" "+age);
		
	}
	public static void main(String[] args) {
		
		InitializeByConstructor ibc=new InitializeByConstructor(22,"Shashank");
		ibc.display();
		//InitializeByConstructor ibc1=new InitializeByConstructor();
		
	}

}
