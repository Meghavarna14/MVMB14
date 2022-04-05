package comparable;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		Student[] stuArray= {new Student(1, "Name01", 22,88.01),new Student(2, "Name02", 21,98.01),new Student(3, "Name04", 19,87.01),
				new Student(4, "Name04", 25,86.01)};
		Arrays.sort(stuArray);
		for (Student student : stuArray) {
			System.out.println(student);
			
		}
	}

}
