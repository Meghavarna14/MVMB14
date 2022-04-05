package com.apache.maven.archetypes.CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQL2 {

	public static void main(String[] args) {
		System.out.println("Hibernet");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu-mysql-01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

//		String str1 = "from Person1 where pId=:id";

	String str2 = "update Person1 set sName=:name where pId=:id";
//		String str3 = "delete from Person where pId=:id";
		Query query = entityManager.createQuery(str2);
		query.setParameter("id", 2);
		query.setParameter("name", "Rosy");
		entityTransaction.begin();
		int executeUpdate = query.executeUpdate();
		entityTransaction.commit();
		System.out.println("Rows affected" + executeUpdate);
	}

}
