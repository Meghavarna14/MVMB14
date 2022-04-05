package com.apache.maven.archetypes.calculator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.person.Person;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu-mysql-01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = new Person();
		person.setPersonId(1);
		person.setPersonName("Sam");
		person.setPersonAge(22);

		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
}
