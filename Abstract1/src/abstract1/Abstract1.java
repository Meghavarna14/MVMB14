package abstract1;

public abstract class Abstract1 {

	int a = 10;
	int b = 20;

	Abstract1() {
		System.out.println("Abstract1()");

	}

	Abstract1(int a, int b) {
		this();
		System.out.println("Abstract1(String a)");
	}

	static {
		System.out.println("main(String args[])");
	}

}
