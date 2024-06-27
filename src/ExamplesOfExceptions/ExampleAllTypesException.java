package ExamplesOfExceptions;

import java.util.Scanner;

public class ExampleAllTypesException {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
	
		
		
		try {
			//add();
			sub();
			mul();
			div();
		}
		
		catch (Exception e) {
			System.out.println("Exception is handled in the main method");
		}

	}
	//In this method we don't handled any Exception
	public static void add() {
		
		System.out.println("Enter the 2 numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(num1+num2);
		
		
	}
	//In this method handled the exception
	public static void sub() {
		try {
			System.out.println("Enter the 2 numbers");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int sub=num1-num2;
			System.out.println(sub);
		}
		catch (Exception e) {
		System.out.println("Exception is handled in the sub method");
		}
	}
	//In this method use Ducking the Exception
	public static void mul() throws Exception {
		System.out.println("Enter the 2 numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int mul=num1*num2;
		System.out.println(mul);
		
	}
	//In this method handled exception and rethrowing the exception
	public static void div() {
		try {
			System.out.println("Enter the 2 numbers");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int div=num1/num2;
			System.out.println(div);
		}
		catch (Exception e) {
			System.out.println("Exception is handled in the div method");
			throw e;
		}
		
	}
}
