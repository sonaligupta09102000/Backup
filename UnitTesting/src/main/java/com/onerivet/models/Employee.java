package com.onerivet.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
//@Table(name = "unittesting")
public class Employee {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userName;
	private String password;
	private String emailId;

}
