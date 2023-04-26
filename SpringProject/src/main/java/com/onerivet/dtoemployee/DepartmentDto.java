package com.onerivet.dtoemployee;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.onerivet.entity.Emplyee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class DepartmentDto {
	@JsonView(value = {View.External.class, View.Internal.class})
	private int department_id;
	@JsonView(value = {View.External.class, View.Internal.class})
	private String department_name;
	@JsonView(value = {View.External.class, View.Internal.class})
	private int emp_salary;
	
	@JsonView(value = {View.Internal.class})
	private EmployeeDto employee;
}
