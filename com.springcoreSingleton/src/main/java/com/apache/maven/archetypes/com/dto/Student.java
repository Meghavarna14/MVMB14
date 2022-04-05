package com.apache.maven.archetypes.com.dto;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Student implements Serializable {
	private int sId;
	private String sName;
	private int sAge;

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
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + "]";
	}

}
