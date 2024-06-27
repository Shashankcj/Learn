package ExamplesOfExceptions;

import java.util.Scanner;

public class ExampleCustom {

	public static void main(String[] args) throws UnderAgeException {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the age");
			int age = sc.nextInt();

			DrivingLicence dl = new DrivingLicence();
			dl.drivinglicence(age);
		} catch (Exception e) {
			System.out.println(e.getMessage());

			throw new UnderAgeException();
			// e.printStackTrace();
		}
	}

}

//Custom Exception
class UnderAgeException extends Exception {

	public UnderAgeException() {
		super("You are young");

	}

}

class OlderAgeException extends Exception {

	public OlderAgeException() {
		super("You are older");

	}

}

class DrivingLicence {
	public void drivinglicence(int age) throws Exception {
		if (age > 18 && age <= 65) {
			System.out.println("You are eligible");

		} else {
			if (age <= 18) {
				throw new UnderAgeException();
			} else {
				throw new OlderAgeException();
			}
		}
	}

}