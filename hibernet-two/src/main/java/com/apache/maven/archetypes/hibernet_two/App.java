package com.apache.maven.archetypes.hibernet_two;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		System.out.println("Hibernet_two");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu-mysql-01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Student student = new Student();
		// student.setSId(1);
		student.setSName("Sam");
		student.setSAge(22);
		student.setSName("Raj");
		student.setSAge(22);

		Address address = new Address();
		// address.setAId(01);
		address.setAline01("aaaa");
		address.setAline02("bbbb");

		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(address);
		entityTransaction.commit();

	}
}
