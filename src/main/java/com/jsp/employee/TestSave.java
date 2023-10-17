package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("Rishi");//getting information from persistence.
		
		EntityManager entityManager=
				entityManagerFactory.createEntityManager();//has all the methods for database operation
		
		EntityTransaction entityTransaction= entityManager.getTransaction();//this is to start the connection and end the operation.
		
		Employee employee=new Employee();
//		employee.setId(1);// @GeneratedValue(strategy = GenerationType.IDENTITY) is added so we don't need employee.setId()

		employee.setName("dca");
		employee.setEmail("dca@gmail.com");
		employee.setCno(856456321);
		
		entityTransaction.begin();
		entityManager.persist(employee);//This will accept entity type of object i.e @Entity object 
		entityTransaction.commit();
	}
}
