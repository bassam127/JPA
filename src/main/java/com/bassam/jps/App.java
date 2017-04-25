package com.bassam.jps;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class App {
	public static void main(String[] args) {
		// EntityManagerFactory
		//entityManagerFactory=Persistence.createEntityManagerFactory("com.bassam.jpa");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("person.jpa");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		entitymanager.getTransaction().begin();
	//	TypedQuery<Person> query=entitymanager.createNamedQuery("person.getPersonByID", Person.class);
		//query.setParameter("id", 2);
		//TypedQuery<Pesron> query=entitymanager.createNamedQuery("person.getall",Person.class);
		//Query query=entitymanager.createNamedQuery("person.getall");
		// show data by primaryKey
		// Person p=entitymanager.find(Person.class, 1);
		// System.out.println(p);
		// Person p=entitymanager.find(Person.class, 1);
		// entitymanager.remove(p);
		// Query query= entitymanager.createQuery("SELECT p FROM Person p ORDER
		// BY p.name ASC");
	//	 List<Person> people= query.getResultList();
	//	for (Person p : people) {
	//	 System.out.println(p);
	//	 }
		// Query query=entitymanager.createQuery("SELECT p FROM Person p");
		// insert data
		 Person p1=new Person("nisren",55);
		 Person p2=new Person("sara",27);
		// Students st=new Students();
		// st.setName("bassam");
		// st.setAge(33);
		 entitymanager.persist(p1);
		 entitymanager.persist(p2);
		entitymanager.getTransaction().commit();
		entitymanager.close();
     	entityManagerFactory.close();
	}

}
