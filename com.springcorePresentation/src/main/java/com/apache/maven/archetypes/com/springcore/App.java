package com.apache.maven.archetypes.com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apache.maven.archetypes.com.dto.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("STUDENT COURSE DETAIL!");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-config.xml");
		Student student = (Student) applicationContext.getBean("StudentCourse");
		System.out.println(student);
	}
}
