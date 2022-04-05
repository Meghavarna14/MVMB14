package com.te.learn.usingrunnable;

public class MyChar2 implements Runnable{
	public void run() {
		synchronized (this) {
			for (char c = 'a'; c <= 'z'; c++) {
				System.out.println("Char: " + c);
			}
		}

	}

}
