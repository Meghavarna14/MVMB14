package com.apache.maven.archetypes.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apache.maven.archetypes.com.dto.Address;
import com.apache.maven.archetypes.com.dto.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-config.xml");
		Student student1 = (Student) applicationContext.getBean("student");
		/* Student student2 = (Student) applicationContext.getBean("student02"); */
		System.out.println(student1);

	}
}
