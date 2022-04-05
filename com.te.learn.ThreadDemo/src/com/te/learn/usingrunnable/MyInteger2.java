package com.te.learn.usingrunnable;

public class MyInteger2 implements Runnable{
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i <= 30; i++) {
				System.out.println("Integer: " + i);
			}
		}
	}
}

