package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=
				Persistence.createEntityManagerFactory("Rishi");
		EntityManager entityManager = 
				entityManagerFactory.createEntityManager();
		
	Employee employee=entityManager.find(Employee.class,2);
	
	System.out.println("Id :"+ employee.getId());
	System.out.println("Name :"+employee.getName());
	System.out.println("Email :"+employee.getEmail());
	System.out.println("Contact number:"+employee.getCno());
	}
}
