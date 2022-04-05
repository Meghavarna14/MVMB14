package com.apache.maven.archetypes.CRUD;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person1 {
	@Id
	@Column(name = "p_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;

	@Column(name = "p_Name")
	private String pName;
	@Column(name = "p_Age")
	private int pAge;

	@ManyToMany(cascade = CascadeType.ALL)
	
	private List<Pet> pet;

	@OneToOne(mappedBy = "person")
	private Smartphone smartphone;

}
