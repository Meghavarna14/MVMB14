package com.apache.maven.archetypes.CRUD;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="caller_table")
public class Call {
	@Id
	@Column(name = "c_No")
	private int cNo;
	@ManyToOne(cascade = CascadeType.ALL)
	private Smartphone smartphone1;
}
