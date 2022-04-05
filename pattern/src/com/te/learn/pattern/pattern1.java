package com.te.learn.pattern;

public class pattern1 {

	public static void main(String[] args) {
		int limit = 6;

		for (int i = 1; i <= limit; ++i) {
			for (int j = 0; j <i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		for (int i = limit; i >= 1; --i) {
		      for (int j = 2; j <= i+1; ++j)   {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}