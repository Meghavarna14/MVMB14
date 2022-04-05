package com.te.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.spring.core.config.dto.Earth;
import com.te.spring.core.config.dto.Goldfish;
import com.te.spring.core.config.dto.Humanbeing;
import com.te.spring.core.config.dto.Lion;
import com.te.spring.core.config.dto.Peacock;
import com.te.spring.core.config.dto.config.Allconfig;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				Allconfig.class);
		Earth earth = (Earth) annotationConfigApplicationContext.getBean("earth");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(earth);

	}
}
