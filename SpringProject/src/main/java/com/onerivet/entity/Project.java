package com.onerivet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Project {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int project_id;
	private String project_name;
	private String project_superviour_name;
	
	
	//@OneToMany(targetEntity = "E")

}
