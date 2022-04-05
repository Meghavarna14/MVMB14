package com.te.learn.Studentarray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Stdmain {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();

		arrayList.add(new Student(1, "Name01", 22));
		arrayList.add(new Student(2, "Name02", 20));
		arrayList.add(new Student(3, "Name03", 19));
		arrayList.add(new Student(4, "Name04", 25));

		System.out.println("1st =====================");
		System.out.println(arrayList);

		System.out.println("2nd =====================");

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		System.out.println("3rd =====================");

		for (Object student : arrayList) {
			System.out.println(student);
		}

		System.out.println("4th =====================");

		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("5th =====================");

		ListIterator listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}

}