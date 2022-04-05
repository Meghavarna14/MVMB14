package com.te.learn.usingthread;

	public class MyChar extends Thread {

		@Override
		public void run() {
			for (char c = 'a'; c <= 'z'; c++) {
				System.out.println("Char: " + c);
			}
		}
	}

