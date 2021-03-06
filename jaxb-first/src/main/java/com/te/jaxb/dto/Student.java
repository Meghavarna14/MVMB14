package com.te.jaxb.dto;

import java.util.Map;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Student {
	private int sId;

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + ", marks=" + marks + "]";
	}

	// @XmlAttribute
	@XmlElement(name = "s_id")
	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	// @XmlAttribute
	@XmlElement(name = "s_name")

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	// @XmlAttribute
	// @XmlElement(name = "s_age")
	@XmlTransient
	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public Map<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}

	public Student(int sId, String sName, int sAge, Map<String, Integer> marks) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
		this.marks = marks;
	}

	public Student() {
		super();
	}

	private String sName;
	private int sAge;
	private Map<String, Integer> marks;

}
