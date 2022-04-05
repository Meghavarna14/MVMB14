package nonstatic;

public class chainconstructor {
	int a = 10;
	int b = 10;
	{
		System.out.println("Non-static multiline initializer got executed");
	}

	public chainconstructor() {
		System.out.println("programmer written instruction in constructor() constructor!");
	}

	public chainconstructor(int a) {
		this();
		this.a = a;
		System.out.println("programmer written instruction in constructor(int a) constructor!");
	}

	public chainconstructor(int a, int b) {
		this(a);
		this.b = b;
		System.out.println("programmer written instruction in constructor(int a,int b) constructor!");
	}

	public static void main(String[] args) {
		System.out.println("main(String[] args) method got executed!");
		chainconstructor constructor = new chainconstructor(20, 40);
		System.out.println(constructor.a);
		System.out.println(constructor.b);

	}

}
