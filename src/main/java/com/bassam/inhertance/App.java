package com.bassam.inhertance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("person.jpa");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		entitymanager.getTransaction().begin();
		Car car = new Car("bmw", 240);
		Buss buss = new Buss("volvo", 40);
		entitymanager.persist(car);
		entitymanager.persist(buss);

		entitymanager.getTransaction().commit();
		entitymanager.close();
		entityManagerFactory.close();
	}
}
