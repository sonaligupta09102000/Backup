package com.onerivet.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Emplyee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
    @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="details_Fk" , referencedColumnName = "department_id")
 	private Department department_details;
	
	@OneToMany
	@JoinColumn(name="proj_details",referencedColumnName = "id")
	private List<Project> project;
    
	private String firstName;
	private String lastName;
	private String password;
	private String emailId;
	private EmpAddress address;
	private String phoneNumber;
	private int age;
}
