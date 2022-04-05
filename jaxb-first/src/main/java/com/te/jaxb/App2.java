package com.te.jaxb;

import java.io.File;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.UnmarshallerHandler;

import com.te.jaxb.dto.Student;

public class App2 {

	public static void main(String[] args) throws JAXBException {
		String xmlcode = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + "<student>\n"
				+ "    <marks>\n" + "        <entry>\n" + "            <key>Java</key>\n"
				+ "            <value>70</value>\n" + "        </entry>\n" + "        <entry>\n"
				+ "            <key>Software Engineering</key>\n" + "            <value>95</value>\n"
				+ "        </entry>\n" + "        <entry>\n" + "            <key>Operating System</key>\n"
				+ "            <value>89</value>\n" + "        </entry>\n" + "        <entry>\n"
				+ "            <key>DBMS</key>\n" + "            <value>90</value>\n" + "        </entry>\n"
				+ "    </marks>\n" + "    <sAge>23</sAge>\n" + "    <sId>1</sId>\n" + "    <sName>Sam</sName>\n"
				+ "</student>\n";
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		File reader = new File("src/main/java/object.xml");
		// StringReader reader = new StringReader(xmlcode);
		Object Unmarshal = unmarshaller.unmarshal(reader);
		Student student = (Student) Unmarshal;
		System.out.println("Unmarshalled Object: \n" + student);

	}

}
