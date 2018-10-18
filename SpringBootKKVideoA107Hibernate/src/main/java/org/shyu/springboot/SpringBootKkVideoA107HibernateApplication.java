package org.shyu.springboot;

import org.shyu.springboot.model.Employee;
import org.shyu.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootKkVideoA107HibernateApplication implements CommandLineRunner{

	@Autowired
	private EmployeeService employeeService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootKkVideoA107HibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setName("Jacky");
		//employee.setDoj(new Date());
		employee.setSalary(5000);
		employeeService.createEmployee(employee);
	}
}
