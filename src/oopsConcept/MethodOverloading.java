package oopsConcept;

public class MethodOverloading {
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}

	public void add(long a,long b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String [] args)
	{
		MethodOverloading mo=new MethodOverloading();
		mo.add(667641211, 462448193);
				
	
	}
	
}
