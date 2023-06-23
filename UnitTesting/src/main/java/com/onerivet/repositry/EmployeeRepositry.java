package com.onerivet.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onerivet.models.Employee;

public interface EmployeeRepositry extends JpaRepository<Employee, Integer> {

	//Object findAll(Employee employee);
	
	

}
