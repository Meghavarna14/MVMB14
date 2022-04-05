package com.apache.maven.archetypes.CRUD;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pet {
	@Id
	@Column(name = "pet_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int petId;
	@Column(name = "t_Name")
	private String tName;
	@ManyToMany(mappedBy = "pet")
	private List<Person1> person1;
}
