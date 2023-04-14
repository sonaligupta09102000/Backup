package com.onerivet.dtoemployee;

import com.onerivet.entity.EmpAddress;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
	
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private String emailId;
	private EmpAddress address;
	private String phoneNumber;
	private int age;
	private DepartmentDto department_details;
	
}
