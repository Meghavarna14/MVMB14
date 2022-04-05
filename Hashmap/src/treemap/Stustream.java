package treemap;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stustream {

	private static final Predicate<Student> Null = null;

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();

		arrayList.add(new Student(1, "Megha", 22));
		arrayList.add(new Student(2, "Bb", 24));
		arrayList.add(new Student(1, "Mary", 21));
		System.out.println(arrayList);
		ArrayList<Student> res;
		Predicate<Student> student=Null;
		res = (ArrayList<Student>) arrayList.stream().filter(student).collect(Collectors.toList());
		System.out.println(res);

	}

}
