package ExamplesOfExceptions;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		//the statement which generates the exception should write inside try block
		try {
			System.out.println("Calculating is started");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the two numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
			System.out.println("Calculating is ended");
		}
		//the statement which has to be executed after exception should write inside the catch block  
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("User defined exception is handeled");
			e.printStackTrace();
		}
		//the statements which is compulsory to be executed exception occurs or not
		finally{
			System.out.println("The process is ended");
		}
	}

}
