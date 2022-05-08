package com.example.jpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.Services.EmployeeService;
import com.example.jpa.entities.Employee;

@RestController
@RequestMapping("/")
public class EmployeeController {
	
	@Autowired
	EmployeeService empser;
	
	@RequestMapping(value = "/addEmployee" , method = RequestMethod.POST)
	public List<Employee> addEmp(@RequestBody Employee emp) {
		return empser.addEmployee(emp);
	}
	
	@RequestMapping(value = "/updateEmployee", method = RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee emp) {
		return empser.updateEmployee(emp);
	}
	
	@RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
	public Employee getEmpById(@PathVariable int id) {
		return empser.findEmployeeById(id);
	}
	
	@RequestMapping(value = "/getAllEmployee", method = RequestMethod.GET)
	public List<Employee> getAllEmployee() {
		return empser.findAllEmployee();
	}
	
	@RequestMapping(value = "/deleteById/{id}", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable int id) {
		empser.deleteEmployee(id);
	}
}
