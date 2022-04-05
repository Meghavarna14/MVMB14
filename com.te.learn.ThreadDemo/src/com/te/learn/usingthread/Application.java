package com.te.learn.usingthread;

public class Application {
	public static void main(String[] args) {
		System.out.println("main(...) starts!");
		MyChar mychar = new MyChar();
		MyInteger myinteger = new MyInteger();
		mychar.start();
		myinteger.start();
		// charThread.run();
		// integerThread.run();
		System.out.println("main(...) ends!");
	}
}
