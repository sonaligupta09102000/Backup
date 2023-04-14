package com.onerivet.service;

import java.util.List;

import com.onerivet.dtoemployee.EmployeeDto;


public interface EmployeeService {
	
	public String addemp(EmployeeDto employeedto);
	
	public List<EmployeeDto> getallemp();
	
	public EmployeeDto getbyid(int id);
	
	public String deletebyid(int id);
	
	public String updatebyid(int id, EmployeeDto employeedto);
	
	public List<EmployeeDto> findbyfirstname(String firstName);

}
