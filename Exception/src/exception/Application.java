package exception;

import java.util.Scanner;

public class Application {

	public static void main(String args[]) throws Agenotcorrect {
		System.out.println("Enter the age");

		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age < 0)
			throw new Agenotcorrect("Entered Age is Negative");
		else
			System.out.println("Entered Age is"  + age);

	}
}
