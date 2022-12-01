package com.prajwal.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.prajwal.entity.Employee;

public class ImprovedEmployeeDao {

	private static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("learning-hibernate");
		Runtime.getRuntime().addShutdownHook(new Thread(() -> emf.close()));
	}

	public void add(Employee emp) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(emp); //persist method will generate insert query
		
		tx.commit();
	}
	
	public Employee fetch(int empno) {
		EntityManager em = emf.createEntityManager();

		//find method generates select query where pk = ?
		Employee emp = em.find(Employee.class, empno);
		
		return emp;
		
	}
	
	public List<Employee> fetchAll() {
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select e from Employee e"); //HQL/JPQL
		List<Employee> list = q.getResultList();
		
		return list;
	}
	
	public List<Employee> fetchAllBySalary(double salary) {
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select e from Employee e where e.salary >= :sal");
		q.setParameter("sal", salary);
		List<Employee> list = q.getResultList();
		
		return list;
	}
	

	public List<String> fetchAllNames() {
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select e.name from Employee e"); //HQL/JPQL
		List<String> list = q.getResultList();
		
		return list;
	}

	public List<Object[]> fetchAllNamesAndSalaries() {
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select e.name,e.salary from Employee e"); //HQL/JPQL
		List<Object[]> list = q.getResultList();
		
		return list;
	}
}
