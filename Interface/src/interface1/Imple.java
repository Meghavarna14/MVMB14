package interface1;

public class Imple implements Left, Right {
	@Override
	public void m1() {
		Left.super.m1();
	}
	
	public static void test() {
		Left.m2();
	}

}
