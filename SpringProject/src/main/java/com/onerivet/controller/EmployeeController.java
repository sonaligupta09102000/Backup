 package com.onerivet.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.onerivet.dtoemployee.DepartmentDto;
import com.onerivet.dtoemployee.EmployeeDto;
import com.onerivet.dtoemployee.View;
import com.onerivet.entity.Department;
import com.onerivet.repisotry.DepartmentRepo;
import com.onerivet.service.EmployeeService;


@RestController
@RequestMapping("/employee")

public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	
	@PostMapping("/add-emp")
	public String addemployee(@RequestBody EmployeeDto employeedto)
	{
		employeeservice.addemp(employeedto);
		return "Added successfully";
	}
	
	@JsonView(value = {View.External.class})
	@GetMapping("/get-all-emp")
	public List<EmployeeDto> getallemployee()
	{
		return employeeservice.getallemp();
	}
	
	
	@GetMapping("/get-emp-by-id/{id}")
	public EmployeeDto getempbyid(@PathVariable int id)
	{
		return employeeservice.getbyid(id);
	}
	
	@DeleteMapping("/delete-emp-by-id/{id}")
	public String deleteempbyid(@PathVariable int id)
	{
		employeeservice.deletebyid(id);
		return "Successful";
	}
	
	@PutMapping("/update-emp-by-id/{id}")
	public String updateempbyid(@PathVariable int id, @RequestBody EmployeeDto employeedto) 
	{
		 employeeservice.updatebyid(id, employeedto);
		 return "Update Succesfully";
	}
	
	@GetMapping("/find-emp-by-firstname")
	public List<EmployeeDto> findbyfirstname(String firstName)
	{
		return employeeservice.findbyfirstname(firstName);
	}
	
	@GetMapping("/find-all-dep/{id}")
	public List<String> findalldepartment(@PathVariable int id)
	{
		return employeeservice.findall(id);
	}
	
	@GetMapping("/find-all-details")
	public List<String> getalldetails(int id)
	{
		return employeeservice.getall(id);
	}
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@JsonView(value = {View.Internal.class})
	@GetMapping("/get-department/{id}")
	public DepartmentDto getDepartment(@PathVariable("id") int id) {
		Department department = this.departmentRepo.findById(id).get();
		return this.modelMapper.map(department, DepartmentDto.class);
	}
	

}
