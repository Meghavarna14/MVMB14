package com.apache.maven.archetypes.Hibernet_courses;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Jpql {
	public static void main(String[] args) {
		System.out.println("Hibernet_two");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu-mysql-01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String str = "from Student";
		Query query = entityManager.createQuery(str);
		List resultList = query.getResultList();
		for (Object object : resultList) {
			Student student = (Student) object;
			System.out.println("=>" + student);
		}
	}
}
