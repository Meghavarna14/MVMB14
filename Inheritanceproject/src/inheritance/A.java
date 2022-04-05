package inheritance;

public class A {
	private int A = 10;
	private int B = 20;

	public A() {
		super();
	}

	public A(int a, int b) {
		super();
		A = a;
		B = b;
	}

	public int getA() {
		return A;
	}

	public void setA(int a) {
		A = a;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}

}
