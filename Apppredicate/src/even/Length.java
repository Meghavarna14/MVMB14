package even;

import java.util.function.Predicate;

public class Length {

	public static void main(String args[]) {
		String s = "Meghavarna";
		Predicate<String> predicate = i -> {

			if (s.length() <= 5)

				return true;
			else
				return false;

		};
		System.out.println("is String Length>5  :" + predicate.test(s));
	}

}
