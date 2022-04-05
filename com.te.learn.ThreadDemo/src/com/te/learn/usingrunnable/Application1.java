package com.te.learn.usingrunnable;

public class Application1 {

	public static void main(String[] args) {

		System.out.println("main(...) starts!");
		Thread thread01 = new Thread(new MyChar2());
		Thread thread02 = new Thread(new MyInteger2());

		thread01.start();
		thread02.start();

		System.out.println("main(...) ends!");
	}

}
