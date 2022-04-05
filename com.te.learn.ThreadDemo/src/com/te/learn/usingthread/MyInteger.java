package com.te.learn.usingthread;

public class MyInteger extends Thread{
	@Override
		public void run() {
			for (int i = 0; i <= 30; i++) {
				System.out.println("Integer: " + i);
			}
		}
	}

