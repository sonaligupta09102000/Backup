package com.onerivet.service;

import java.util.List;

import com.onerivet.models.Employee;

public interface EmployeeService {
	
	public Employee addEmp(Employee emp);
	
	public List<Employee> getAllEmp();
	
	public Employee getById(int id);
	
	public Employee updateByEmployee(int id,Employee emp);
	
	public void deleteEmployee(int id);
	
	

}
