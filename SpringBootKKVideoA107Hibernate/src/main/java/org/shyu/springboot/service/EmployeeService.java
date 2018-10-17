package org.shyu.springboot.service;

import org.shyu.springboot.dao.EmployeeDao;
import org.shyu.springboot.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	public void createEmployee(Employee employee) {
		employeeDao.createEmpoyee(employee);
	}
}
