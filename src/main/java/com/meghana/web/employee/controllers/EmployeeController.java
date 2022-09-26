package com.meghana.web.employee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.meghana.web.employee.entities.Employee;
import com.meghana.web.employee.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createEmployee";
	}
	
	
	@RequestMapping("/saveEmp")
	public String saveEmployee(@ModelAttribute("employee") Employee employee, ModelMap modelMap) {
		Employee employeeSaved = service.saveEmployee(employee);
		String msg = "Employee Saved with id:" + employeeSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createEmployee";
	}
	
	@RequestMapping("/displayEmployees")
	public String displayEmployees(ModelMap modelMap) {
		List<Employee> employees = service.getAllEmployees();
		modelMap.addAttribute("employees", employees);
		return "displayEmployees";
	}
	
	@RequestMapping("deleteEmployee")
	public String deleteEmployee(@RequestParam("id") int id,ModelMap modelMap) {
//		Employee employee = service.getEmployeeById(id);
		Employee employee = new Employee();
		employee.setId(id);
		service.deleteEmployee(employee);
		List<Employee> employees = service.getAllEmployees();
		modelMap.addAttribute("employees", employees);		
		return "displayEmployees";
	}
	
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id,ModelMap modelMap) {
		Employee employee = service.getEmployeeById(id);
		modelMap.addAttribute("employee", employee);		
		return "updateEmployee";
	}
	
	@RequestMapping("/updateEmp")
	public String updateEmployee(@ModelAttribute("employee") Employee employee, ModelMap modelMap) {
		service.updateEmployee(employee);
		List<Employee> employees = service.getAllEmployees();
		modelMap.addAttribute("employees", employees);		
		return "displayEmployees";
	}
	
	
}
