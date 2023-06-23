package com.onerivet.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onerivet.models.Employee;
import com.onerivet.repositry.EmployeeRepositry;
import com.onerivet.service.EmployeeService;

@Service
public class EmployeeImpl implements EmployeeService {

	@Autowired
	private EmployeeRepositry employeeRepositry;
	
	
	public EmployeeImpl(EmployeeRepositry employeeRepositry) {
		super();
		this.employeeRepositry = employeeRepositry;
	}

	@Override
	public Employee addEmp(Employee emp) {
		Employee save = employeeRepositry.save(emp);
		return save;
	}

	@Override
	public List<Employee> getAllEmp() {
		List<Employee> all = employeeRepositry.findAll();
		return all.stream().collect(Collectors.toList());
	}

	@Override
	public Employee getById(int id) {
		Employee employee = employeeRepositry.findById(id).get();
		return employee;
	}

	@Override
	public Employee updateByEmployee(int id, Employee emp) {
		Employee employee = employeeRepositry.findById(id).get();
		employee.setUserName(emp.getUserName());
		employee.setEmailId(emp.getEmailId());
		employee.setPassword(emp.getPassword());
		Employee save = employeeRepositry.save(employee);
		return save;
	}

	@Override
	public void deleteEmployee(int id) {
		Employee employee = employeeRepositry.findById(id).get();
		employeeRepositry.deleteById(id);
		
		
	}

}
