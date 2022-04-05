package interface1;

public interface Left {
String str = "";
	
	default void m1() {
		System.out.println("Left implementation!");
	}
	
	static void m2() {
		System.out.println("static m2() of Left!");
	}

}
