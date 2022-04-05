package com.apache.maven.archetypes.hibernet_two;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "a_id")
	private int aId;
	@Column(name = "a_line01")

	private String aline01;
	@Column(name = "a_line02")

	private String aline02;

	@OneToOne
	@JoinColumn(name = "s_fk")

	private Student student;

	@Override
	public String toString() {
		return "Address [aId=" + aId + ", aline01=" + aline01 + ", aline02=" + aline02 + ", student=" + student + "]";
	}

}
