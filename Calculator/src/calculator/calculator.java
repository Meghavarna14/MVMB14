package calculator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {

		boolean exit = false;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("====calculator=====");
			System.out.println("enter the option to calculate");
			System.out.println("1.Add");
			System.out.println("2.Substrat");
			System.out.println("3.Multiplication");
			System.out.println("4.divide");
			System.out.println("5.Exit");

			int option = scanner.nextInt();
			switch (option) {

			case 1: {
				System.out.println("enter the first num");
				int a = scanner.nextInt();
				System.out.println("enter the second nu");
				int b = scanner.nextInt();
				int sum = calcu.add(a, b);
				System.out.println("res" + sum);

			}
				break;
			case 2: {
				System.out.println("enter the first num");
				int a = scanner.nextInt();
				System.out.println("enter the second nu");
				int b = scanner.nextInt();
				int sub = calcu.sub(a, b);
				System.out.println("res" + sub);
			}
				break;

			case 3: {
				System.out.println("enter the first num");
				int a = scanner.nextInt();
				System.out.println("enter the second nu");
				int b = scanner.nextInt();
				int mul = calcu.mul(a, b);
				System.out.println("res" + mul);
			}
				break;
			case 4: {
				System.out.println("enter the first num");
				int a = scanner.nextInt();
				System.out.println("enter the second nu");
				int b = scanner.nextInt();
				int div = calcu.div(a, b);
				System.out.println("res" + div);

			}
				break;
			case 5: {
				System.out.println("System exited");
				System.exit(0);

			}
				break;

			default: {
				System.out.println("option invalid");
			}
				break;

			}
		} while (!exit) ;

	}

}
