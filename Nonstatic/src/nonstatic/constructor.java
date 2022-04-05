package nonstatic;

public class constructor {
	int a = 10;
	int b = 10;
	{
		System.out.println("Non-static multiline initializer got executed");
	}

	constructor() {
		System.out.println("programmer written instruction!");
	}

	public static void main(String[] args) {
		System.out.println("main(String[] args) method got executed!");
		constructor constructor = new constructor();
	}

}
