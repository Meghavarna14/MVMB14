package com.te.learn.pattern;

public class pattern2 {

	public static void main(String[] args) {
		int limit = 5;

	    for (int i = 1; i <= limit; ++i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print("* ");
	      }
	      System.out.println();
	    }
	}

}
