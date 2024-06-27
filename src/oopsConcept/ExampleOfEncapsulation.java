package oopsConcept;

public class ExampleOfEncapsulation {

	public static void main(String[] args) {
		
		Student st=new Student();
		//using setter method
		st.setData("Shashank",22,12000);
		System.out.println(st.getName()+" "+st.getAge()+" "+st.getSalary());

	}

}
class Student{
	private String name;
	private int age;
	private float salary;
	
	
	
	public void setData(String name, int age, float salry)
	{
		this.name=name;
		this.age=age;
		this.salary=salry;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	public float getSalary()
	{
		return salary;
	}
}
