package string;

public class Newstring {
; static void main(String[] args) {
		String str = "Hello";
		String str2 = new String("Hello");

		str2.toLowerCase(); // Created a new object in Heap Area
		System.out.println(str2); // Hello

		str2 = str2.toLowerCase();
		System.out.println(str2); // hello

	}
	
//	public static void main(String[] args) {
//		String str = new String("Hello");
}


           



