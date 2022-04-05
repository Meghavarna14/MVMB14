package com.te.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.spring.core.dto.Address;
import com.te.spring.core.dto.Student;

@Configuration
public class Appconfig {
	@Bean(name = "student")
	public Student getStudentObj() {
		Student student = new Student();
		student.setsId(1);
		student.setsName("SAM");
		student.setsAge(22);
		return student;
	}

	@Bean(name = "address1")
	@Primary
	public Address getAddressObj1() {
		Address address = new Address();
		address.setaId(101);
		address.setaState("kerala");
		address.setaCity("Thrissur");
		return address;
	}
	@Bean(name = "address2")
	public Address getAddressObj2() {
		Address address = new Address();
		address.setaId(101);
		address.setaState("karnataka");
		address.setaCity("mysore");
		return address;
	}
	@Bean(name = "address3")
	public Address getAddressObj3() {
		Address address = new Address();
		address.setaId(101);
		address.setaState("kerala");
		address.setaCity("palakad");
		return address;
	}
}
