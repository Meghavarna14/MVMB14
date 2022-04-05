package com.apache.maven.archetypes.Hibernet_courses;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.Unmarshaller.Listener;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student_table")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "s_id")
	private int sId;
	@Column(name = "s_name")
	private String sName;
	@Column(name = "s_age")
	private int sAge;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "s_c_map", joinColumns = @JoinColumn(name = "s_fk"), inverseJoinColumns = @JoinColumn(name = "c_fk"))
	private List<Courses> courses;
}