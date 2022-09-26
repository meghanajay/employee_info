package com.meghana.web.employee.service;

import java.util.List;

import com.meghana.web.employee.entities.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee); 
	
	Employee updateEmployee(Employee employee);
	
	void deleteEmployee(Employee employee);
	
	Employee getEmployeeById(int id);

	List<Employee> getAllEmployees();
}
