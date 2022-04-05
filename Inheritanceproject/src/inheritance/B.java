package inheritance;

public class B extends A {
	private int C = 50;
	private int D = 30;

	public B(int c, int d) {
		super();
		C = c;
		D = d;
	}

	public B() {
		super();
	}

	public int getC() {
		return C;
	}

	public void setC(int c) {
		C = c;
	}

	public int getD() {
		return D;
	}

	public void setD(int d) {
	
		D = d;
	}

}
