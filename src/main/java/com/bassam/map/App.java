package com.bassam.map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class App {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("person.jpa");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		StudentPerson student=new StudentPerson();
		student.setName("jon");
		student.setAge(29);
		student.setDriverLicences("licence for jon number is 345543");

		entitymanager.getTransaction().commit();
		entitymanager.close();
		entityManagerFactory.close();
	}

}
