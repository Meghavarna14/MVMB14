package nonstatic;

public class Static {
	int a = 10;
	{
		System.out.println("static multiline initializer got executed!");
	}

	public void demoStaticMethod() {
		System.out.println("demoStaticMethod() non-static method got executed!");
	}

	public static void main(String[] args) {

		System.out.println("main(String[] args) method got executed!");
		System.out.println("Now I'am creating an object--");
		Static Static = new Static();
		System.out.println("End!");

	}

}
