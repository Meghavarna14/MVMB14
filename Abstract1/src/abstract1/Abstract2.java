package abstract1;

public class Abstract2 extends Abstract1 {
	int c=30;
	int d=40;
	Abstract2() {
		super(30, 40);

		System.out.println("B1()");

	}

Abstract2(int c, int d) {
		this();
		System.out.println("Abstract2(String a)");

	}
static {
	System.out.println("main(String args[])");
}

}
