package com.meghana.web.employee.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meghana.web.employee.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	

}
