package com.bassam.compostion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("person.jpa");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		entitymanager.getTransaction().begin();
		Address address = new Address("wallStreet", 844);
		Employee employee = new Employee();

		employee.setEmployeeName("Ema");
		employee.setAddress(address);
		address.setEmployee(employee);
		
		entitymanager.persist(address);
		entitymanager.persist(employee);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		entityManagerFactory.close();

	}

}
