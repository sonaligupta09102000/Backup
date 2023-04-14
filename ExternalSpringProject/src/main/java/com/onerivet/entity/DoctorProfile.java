package com.onerivet.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="doctor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class DoctorProfile {
	
	private String emailId;
	private String password;
	private String confirm_password;
	private String firstName;
	private String lastName;
	private String specialization;
	private String mobileNo;
	private String institute_name;
	private String data_of_establishment;
	private String gender;
	private String address;
	private String state;
	private String city;
	private String certificate_of_institution;
	private String degreeorcertificate_of_doctor;
	
}
