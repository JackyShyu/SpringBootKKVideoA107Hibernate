package org.shyu.springboot.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.shyu.springboot.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void createEmployee(Employee employee) {
		Session session = null;
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
	}
}
