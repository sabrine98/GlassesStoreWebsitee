package com.glassestore.entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UsersTest {

	public static void main(String[] args) {
		Users user1 = new Users();
		user1.setEmail("samira1258746@gmail.com");
		user1.setFullName("samira");
		user1.setPassword("hahaha");
		
     EntityManagerFactory entityManagerFactory   = Persistence.createEntityManagerFactory("GlassesStoreWebsite");
     EntityManager entityManager = entityManagerFactory.createEntityManager();
     entityManager.getTransaction().begin();
     entityManager.persist(user1);
     entityManager.getTransaction().commit();
     entityManager.close();
     entityManagerFactory.close();
     
     System.out.println("A users object was persisted");
	}

}
