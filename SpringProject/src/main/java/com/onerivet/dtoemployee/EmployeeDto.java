package com.onerivet.dtoemployee;



import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

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
	@JsonView(value = {View.External.class, View.Internal.class})
	private String firstName;
	@JsonView(value = {View.External.class, View.Internal.class})
	private String lastName;
	
	private String password;
	private String emailId;
	@JsonView(value = {View.External.class})
	private EmpAddressDto address;
	@JsonView(value = {View.Internal.class})
	private String phoneNumber;
	@JsonView(value = {View.Internal.class})
	private int age;
	@JsonView(value = {View.External.class})
	private DepartmentDto department_details;
	
	private List<ProjectDto> projects;
	
}
