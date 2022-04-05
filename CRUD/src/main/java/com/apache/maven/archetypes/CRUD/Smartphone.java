package com.apache.maven.archetypes.CRUD;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class Smartphone {
	@Id
	@Column(name = "s_Model")
	private String sModel;
	@Column(name = "s_Ram")
	private int sRam;

	@OneToMany(mappedBy = "smartphone1", cascade = CascadeType.ALL)
	private List<Call> call;
	
	@OneToOne
	private Person1 person;
}
