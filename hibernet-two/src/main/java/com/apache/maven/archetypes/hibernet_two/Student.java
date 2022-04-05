package com.apache.maven.archetypes.hibernet_two;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sid")
	private int sId;
	@Column(name = "s_name")
	private String sName;
	@Column(name = "s_age")
	private int sAge;
	@OneToOne(mappedBy = "student")
	private Address address;

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + ", address=" + address + "]";
	}

	// @OneToMany(mappedBy = "Student",cascade=CascadeType.ALL)
	// private Address address;
}
