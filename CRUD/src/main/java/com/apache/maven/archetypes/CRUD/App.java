package com.apache.maven.archetypes.CRUD;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu-mysql-02");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person1 person1 = new Person1();
		person1.setPName("Janani");
		person1.setPAge(22);
		Person1 person2 = new Person1(); 

		person2.setPName("Ram");
		person2.setPAge(23);
		ArrayList<Person1> person = new ArrayList<Person1>();
		person.add(person1);
		person.add(person2);

		Pet pet1 = new Pet();
		pet1.setTName("Sam");
		Pet pet2 = new Pet();
		pet2.setTName("Bruno");
		ArrayList<Pet> pet = new ArrayList<Pet>();
		pet.add(pet1);
		pet.add(pet2);

		Smartphone smartphone = new Smartphone();
		smartphone.setSRam(16);
		smartphone.setSModel("Redmi note9 pro");
		smartphone.setSRam(32);
		smartphone.setSModel("Samsung");

		Call call1 = new Call();
		call1.setCNo(100);
		Call call2 = new Call();
		call2.setCNo(108);
		ArrayList<Call> call = new ArrayList<Call>();
		call.add(call1);
		call.add(call2);
		
		// Many to Many Bidirectional
		person1.setPet(pet);
		person2.setPet(pet);
		pet1.setPerson1(person);
		pet2.setPerson1(person);
		
		//one to one Bidirectional
		person1.setSmartphone(smartphone);
		person2.setSmartphone(smartphone);
		smartphone.setPerson(person1);
		smartphone.setPerson(person2);
		
		//one to many Bidirectional
		smartphone.setCall(call);
		smartphone.setCall(call);
		call1.setSmartphone1(smartphone);
		call2.setSmartphone1(smartphone);
		
		entityTransaction.begin();
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(pet1);
		entityManager.persist(pet2);
		entityManager.persist(smartphone);
		entityManager.persist(call1);
		entityManager.persist(call2);
		entityTransaction.commit();
	}
}
