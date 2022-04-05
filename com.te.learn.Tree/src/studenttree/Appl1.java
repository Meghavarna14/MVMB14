package studenttree;

import java.util.TreeSet;

public class Appl1 {

	public static void main(String[] args) {
		
			TreeSet <Student1>treeSet=new TreeSet<Student1>();
			treeSet.add(new Student1("a",01,23));
			treeSet.add(new Student1("b",03,22));
			treeSet.add(new Student1("c",02,19));
			treeSet.add(new Student1("d",04,27));
	for (Student1 student : treeSet) {
		System.out.println(student);
	}
		}
	}



