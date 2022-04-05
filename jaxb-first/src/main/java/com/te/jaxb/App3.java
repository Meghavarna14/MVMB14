package com.te.jaxb;

import java.io.File;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.te.jaxb.dto.Address;
import com.te.jaxb.dto.Collegestudent;
import com.te.jaxb.dto.Student;

public class App3 {
	public static void main(String[] args) throws JAXBException {
		System.out.println("Hello World!");
		HashMap<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("Software Engineering", 95);
		marks.put("Operating System", 89);
		marks.put("DBMS", 90);
		marks.put("Java", 70);

		Address address = new Address();
		address.setaId(01);
		address.setaLine01("Bannerghatta");
		address.setaLine02("Bengaluru");
		

		Collegestudent student = new Collegestudent();
		student.setsId(1);
		student.setsName("Ram");
		student.setsAge(23);
		student.setMarks(marks);
		student.setAddress(address);
		System.out.println("java Object:\n" + student);

		JAXBContext jaxbContext = JAXBContext.newInstance(Collegestudent.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
		File handler = new File("src/main/java/object.xml");
		// StringWriter handler = new StringWriter();
		marshaller.marshal(student, handler);
		// System.out.println("XML code:/n" + handler);

	}
}
