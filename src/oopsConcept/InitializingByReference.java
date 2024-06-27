package oopsConcept;

public class InitializingByReference {
	
	String name;
	int age;
	
	

	public static void main(String[] args) {
	InitializingByReference ibr=new InitializingByReference();
	ibr.age=22;
	ibr.name="Shashank";
	
	System.out.println(ibr.age+" "+ibr.name);

	}

}
