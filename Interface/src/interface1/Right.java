package interface1;

public interface Right {
	default void m1() {
		System.out.println("Right implementation!");
	}
	
	static void m2() {
		System.out.println("static m2() of Right!");
	}
}
