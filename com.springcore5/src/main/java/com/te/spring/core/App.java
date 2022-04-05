package com.te.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.spring.core.config.Appconfig;
import com.te.spring.core.dto.Address;
import com.te.spring.core.dto.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		Student student = (Student) applicationContext.getBean("student");
		/* Student student2 = (Student) applicationContext.getBean("student02"); */
		System.out.println(student);

	}
}
