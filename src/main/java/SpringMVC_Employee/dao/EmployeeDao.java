package SpringMVC_Employee.dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import SpringMVC_Employee.EmployeeConfiguration;
import SpringMVC_Employee.dto.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	EntityManager manager;
	@Autowired
	EntityTransaction transaction;
	
	
	
	public Employee saveEmployee(Employee employee) {
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
		
		return employee;
	}
}
