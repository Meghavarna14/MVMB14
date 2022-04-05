package hashset;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet<Stu> set = new HashSet<Stu>();
		set.add(new Stu("a",2,22));
		set.add(new Stu("b",2,22));
		set.add(new Stu("c",3,22));
		set.add(new Stu("d",4,22));
		for (Stu in : set) {
			System.out.println(in + "");

		}
	}

}
