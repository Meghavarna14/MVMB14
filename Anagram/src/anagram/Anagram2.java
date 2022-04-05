package anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String");
		String x = sc.nextLine();
		System.out.println("Enter the second String");
		String y = sc.nextLine();

		x = x.replaceAll("  ", "");
		y = y.replaceAll("  ", "");

		x = x.toLowerCase();
		y = y.toLowerCase();
		char a[] = x.toCharArray();
		char b[] = y.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		Boolean result = Arrays.equals(a, b);
		if (result == true) {
			System.out.println("Strings are Anagram");
		} else {
			System.out.println("Strings are not Anagram");
		}
	}
}