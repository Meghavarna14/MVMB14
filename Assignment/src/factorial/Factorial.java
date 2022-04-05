package factorial;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		int i = 1, fact = 1, number;
		System.out.println("Enter the number to which you need to find the factorial:");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();

		while (i <= number) {
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial of the given number is:: " + fact);
	}
}