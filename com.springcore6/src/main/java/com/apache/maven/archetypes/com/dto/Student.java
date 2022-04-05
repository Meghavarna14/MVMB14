package com.apache.maven.archetypes.com.dto;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student implements Serializable {
	@Value("1")
	private int sId;
	@Value("Sam")
	private String sName;
	@Value("23")

	private int sAge;
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Autowired
	public Student(Address address) {
		super();
		this.address = address;
	}

	public Student() {
		super();
		System.out.println("Student()was called");
	}

	public Student(int sId, String sName, int sAge) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
		System.out.println("Student(int sId, String sName, int sAge) was called");

	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
		System.out.println("setsId(int sId)was called");

	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
		System.out.println("setsName(String sName)was called");

	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
		System.out.println("setsAge(int sAge)was called");

	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + ", address=" + address + "]";
	}

}
