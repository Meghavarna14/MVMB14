package interface1;

public interface I01 {
int var = 10;
	
	void test();
	
	default void name() {
		System.out.println("default method!");
	}
	
	static void m1() {
		System.out.println("static method!");
	}
	}

