package com.onerivet.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onerivet.models.Employee;
import com.onerivet.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/add-emp")
	public Employee addAllEmployee(@RequestBody Employee emp) {
		Employee addEmp = employeeService.addEmp(emp);
		return addEmp;
	}

	@GetMapping("/get-all-emp")
	public List<Employee> getAllEmp() {
		List<Employee> allEmp = employeeService.getAllEmp();
		return allEmp.stream().collect(Collectors.toList());
	}

	@GetMapping("/get-by-id/{id}")
	public Employee getEmpById(@PathVariable int id) {
		Employee empbyid = employeeService.getById(id);
		return empbyid;
	}

	@PutMapping("/update-emp/{id}")
	public Employee updateEmp(@PathVariable int id, @RequestBody Employee emp) {
		Employee updateByEmployee = employeeService.updateByEmployee(id, emp);
		return updateByEmployee;
	}

	@DeleteMapping("/delete-emp/{id}")
	public void deleteEmp(int id) {
		employeeService.deleteEmployee(id);
	}

}
