package com.glassestore.dao;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.AnnotationException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.glassestore.entity.Users;

public class UserDAOTest {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static UserDAO userDAO;
	
	@BeforeClass
	public static void setUpClass() {
		entityManagerFactory   = Persistence.createEntityManagerFactory("GlassesStoreWebsite");
	    entityManager = entityManagerFactory.createEntityManager();
	     
	     userDAO = new UserDAO(entityManager);
		
	}
	
	
	@Test
	public void testCreateUsers() {
		Users user1 = new Users();
		user1.setEmail("David@hotmail.com");
		user1.setFullName("David");
		user1.setPassword("ha12");
		
    
     user1 = userDAO.create(user1);
     
     assertTrue(user1.getUserId() > 0);
	}
 
	@Test
	public void testCreateUsersFieldsNotSet() {
		Users user1 = new Users();
     user1 = userDAO.create(user1);
     
    
	}
	
	@Test
	public void testUpdateUsers() {
		Users user = new Users();
		user.setUserId(1);
		user.setEmail(" sabrine@codejava.net");
		user.setFullName("sabrine");
		user.setPassword("hello");
		
		user = userDAO.update(user);
		String expected = "hello";
		String actual = user.getPassword();
		
	    assertEquals(expected ,  actual);
	    }
	
	@AfterClass
	public static void tearDownClass() {
		 entityManager.close();
	     entityManagerFactory.close();
	     
		
	}
	
}
