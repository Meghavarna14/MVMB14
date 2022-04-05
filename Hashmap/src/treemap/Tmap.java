package treemap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Tmap {
	static Comparator comparator = (o1, o2) -> {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		if (i1 > i2)
			return 1;
		else if (i1 < i2)
			return -1;
		return 0;

	};

	public static void main(String args[]) {

		TreeMap<Integer, Student> treeMap = new TreeMap<Integer, Student>(comparator);
		treeMap.put(1, new Student(1, "Mm", 22));
		treeMap.put(2, new Student(2, "Bm", 19));
		treeMap.put(3, new Student(3, "Bb", 27));
		for (Entry<Integer, Student> entry : treeMap.entrySet()) {
			System.out.println("Key-" + entry.getKey() + "-value-" + entry.getValue());
		}

	}

}
