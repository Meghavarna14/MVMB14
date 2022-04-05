package com.te.person;

import javax.persistence.Entity;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	@Id
	private int personId;
	private String personName;
	private int personAge;
}
