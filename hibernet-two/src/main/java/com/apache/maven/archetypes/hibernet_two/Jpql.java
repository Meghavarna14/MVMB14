package com.apache.maven.archetypes.hibernet_two;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Jpql {

	public static void main(String[] args) {
		System.out.println("Hibernet_two");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu-mysql-01");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		// String str = "delete from Student where sId=:id";
		// String str = "from Student where sId=:id";
		String str2 = "update Student set sName=:name where sId=:id";

		Query query = entityManager.createQuery(str2);
		query.setParameter("id", 2);
		query.setParameter("name", "Ram");

		entityTransaction.begin();
		int executeUpdate = query.executeUpdate();
		entityTransaction.commit();
		System.out.println("Rows affected" + executeUpdate);
	}

}
