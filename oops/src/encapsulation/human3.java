package encapsulation;

public class human3 {

	public static void main(String[] args) {
		Human human01 = new Human("Name01", 22, 123, 78);
		Human human02 = new Human("Name01", 22, 123, 78);

		human01.equals(human02);

		System.out.println("Is same? " + human01.equals(human02));

		if (human01 == human02) {
			System.out.println("Is same");
		} else {
			System.out.println("Not same");
		}

		System.out.println(human01.hashCode());
	}

}
