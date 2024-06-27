package oopsConcept;

public class InitializeByMethod {
	
	int age;
	String name;
	
	public void initialMethod(int age,String name) {
		this.age=age;
		this.name=name;
		
	}
	
	public void display() {
		System.out.println(age+" "+name);
		
	}

	public static void main(String[] args) {
	
		InitializeByMethod ibm=new InitializeByMethod();
		ibm.initialMethod(22, "Shashank");
		ibm.display();
	}

}
