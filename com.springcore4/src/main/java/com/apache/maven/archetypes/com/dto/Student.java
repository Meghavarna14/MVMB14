package com.apache.maven.archetypes.com.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Student implements Serializable {
	private int sId;
	private String sName;
	private int sAge;
	private List<String> friendList;
	private Set<Integer> numberSet;

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

	public List<String> getFriendList() {
		return friendList;
	}

	public void setFriendList(List<String> friendList) {
		this.friendList = friendList;
	}

	public Set<Integer> getNumberSet() {
		return numberSet;
	}

	public void setNumberSet(Set<Integer> numberSet) {
		this.numberSet = numberSet;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + ", friendList=" + friendList
				+ ", numberSet=" + numberSet + "]";
	}

}
