package com.apache.maven.archetypes.Hibernet_courses;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		System.out.println("Hibernate!");
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("PU01");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();
Student student1=new Student();
student1.setSName(("student05");

		