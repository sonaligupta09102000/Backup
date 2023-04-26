package com.onerivet.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Department {
	
	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="dep", referencedColumnName = "id")
	private Emplyee employee;
	
	
	//@Column(name="depart_pk")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int department_id;
	private String department_name;
	private int emp_salary;
	

	
}
