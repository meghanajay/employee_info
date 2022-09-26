package com.meghana.web.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meghana.web.employee.entities.Employee;
import com.meghana.web.employee.repos.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return repository.save(employee);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		repository.delete(employee);
	}

	@Override
	public Employee getEmployeeById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

}
