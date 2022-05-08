package com.example.jpa.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.jpa.DAO.EmployeeDAO;
import com.example.jpa.entities.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO empdao;
	
	public List<Employee> addEmployee(Employee emp) {
		empdao.saveAndFlush(emp);
		return empdao.findAll();
	}
	
	public Employee findEmployeeById(int id){
		return empdao.findById(id).get();	
	}

	public List<Employee> findAllEmployee(){
		return empdao.findAll();	
	}
	

	public String deleteEmployee(int id){
		empdao.deleteById(id);	
		return "Employee having Employee Id " + id + " is Deleted"; 
	}

	public Employee updateEmployee(Employee emp){
		return empdao.saveAndFlush(emp);	
	}
}
