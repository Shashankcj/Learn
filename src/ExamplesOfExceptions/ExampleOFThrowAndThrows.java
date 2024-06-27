package ExamplesOfExceptions;

import java.util.Scanner;

public class ExampleOFThrowAndThrows {

	public static void main(String[] args) {
		
		shop();
	}
	
	public static void shop() {
		try {
			System.out.println("Shopping started");
			pay();
			System.out.println("Shoping is Finished");
		}
		
		catch (Exception e) {
			System.out.println("Shopping is failed");
		}
		
		
	}
	
	public static void pay() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		try {
			
 			System.out.println("Enter the amount");
			int amt=sc.nextInt();
			System.out.println("Paymet successfull with the amount "+amt);
		}
		catch (Exception e) {
			System.out.println("Payment is failed");
			throw e;
		}
	}

}
