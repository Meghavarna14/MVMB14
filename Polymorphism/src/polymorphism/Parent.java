package polymorphism;

class Parent_ {
	int a = 10;

	public static void test() {
		System.out.println("Parent_ test() method");

	}

}

class Child_ extends Parent_ {
	int a = 20;

	public static void test() {
		System.out.println("child_test() method!");

	}

}

public class Parent {
	/*
	 * in compile time polymorphism type of reference has highest priority for
	 * binding
	 */
	public static void main(String[] args) {
		Parent_ parent_ = new Child_();
		parent_.test();
		Child_ child = (Child_) parent_;
		child.test();
	}

}