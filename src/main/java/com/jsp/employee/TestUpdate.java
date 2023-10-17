package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=
				Persistence.createEntityManagerFactory("Rishi");
		EntityManager entityManager=
				entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=
				entityManager.getTransaction();
		
		
		Employee employee=entityManager.find(Employee.class, 1);
		employee.setName("Harry");
		employee.setEmail("harry@mail.com");
		
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		
	}

}
