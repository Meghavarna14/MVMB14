package anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String args[]) {
		String x = "SILENT";
		String y = "LISTEN";
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