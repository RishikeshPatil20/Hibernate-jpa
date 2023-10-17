package com.jsp.employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAll {

	public static void main(String[] args) {

		EntityManagerFactory eniEntityManagerFactory=
				Persistence.createEntityManagerFactory("Rishi");
		EntityManager entityManager=
				eniEntityManagerFactory.createEntityManager();
		
		//here we are writing hql(hibernate query language) query in String sql i.e custom query
		String sql="SELECT e FROM Employee e";
		
		Query query=entityManager.createQuery(sql);
		
		// here we return a list 
		List<Employee> employees= query.getResultList();
		for(Employee e : employees) {
			System.out.println("++++++++++++++++++++++++++++++");
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getEmail());
			System.out.println(e.getCno());
		}
		
		
		
	}

}
