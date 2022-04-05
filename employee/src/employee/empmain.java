package employee;

import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class empmain {

	public static void main(String[] args) {
LinkedList linkedList=new LinkedList();
linkedList.add(new empmain("Mm",01,22));
linkedList.add(new empmain("bb",02,23));
linkedList.add(new empmain("nn",03,25));
System.out.println("Linkedlist");
for(Object object:linkedList) {
	System.out.println("linkedlist");
	System.out.println("========================");
	Iterator iterator= linkedList.iterator();
		while(iterator.hasNext()) {
			System.out.println("");
		}
	}
}


	};

}
