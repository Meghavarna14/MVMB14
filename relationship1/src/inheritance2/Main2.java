package inheritance2;

public class Main2 {
	public static void main(String[] args) {
		BB bb = new BB();
		bb.aStaticMethod();
		
		AA aa = new BB();
		aa.aStaticMethod();
	}
}
