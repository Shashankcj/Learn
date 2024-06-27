package ExamplesOfExceptions;

public class MultipelMethods {

	public static void main(String[] args)  {
		try {
			int a = 5;

			int b = 0;

			multiple(a, b);
			System.out.println("Calculation is ended");
		}

		catch (Exception e) {
			System.out.println("Exception is handeled in main method" + e);
		}

		finally

		{
			System.out.println("hiiii");
		}

	}

	public static void multiple(int a, int b) {
		// try {
		System.out.println("Multiplication is started");
		System.out.println(a * b);
		divide(a, b);
		System.out.println("Multiplication is ended");

//		}
//		catch (Exception e) {
//			System.out.println("Exception is handeled in Multiple method");
//		}

	}

	public static void divide(int a, int b) {

		// try {
		System.out.println("Division is started");
		System.out.println(a / b);
		System.out.println("Division is ended");
		// }

	}

}
