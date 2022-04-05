package com.apache.maven.archetypes.Hibernet_courses;

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
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Courses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c_id")
	private int cId;
	@Column(name = "c_Name")
	private String cName;

	@ManyToMany(mappedBy = "Courses")
	private List<Student> students;

	@Override
	public String toString() {
		return "Courses [cId=" + cId + ", cName=" + cName + "]";
	}
}
