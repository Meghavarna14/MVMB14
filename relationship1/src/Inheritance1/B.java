package Inheritance1;

public class B extends A{
	private int c = 30;
	private int d = 40;

	public B() {
		super();
	}

	public B(int c, int d) {
		super();
		this.c = c;
		this.d = d;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

}
