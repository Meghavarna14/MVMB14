package even;

import java.util.function.Predicate;

public class Evenpredicate {

	public static void main(String[] args) {
		Predicate<Integer> predicate = i -> {
			if (i % 2 == 0)
				return true;
			else
				return false;
		};
		int n = 2;
		System.out.println("Is Even=" + predicate.test(n));
	}

	// {
	// Predicate<Integer> predicate=i ->i%2==0;// another way
	// }
}