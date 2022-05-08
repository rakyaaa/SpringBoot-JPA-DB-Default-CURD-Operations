package com.example.jpa.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.entities.Employee;

@Repository("empDao")
public interface EmployeeDAO extends JpaRepository<Employee, Integer>{
	
	//In this DAO we will use all the default available methods in the curd Repository and JPA repository


}
