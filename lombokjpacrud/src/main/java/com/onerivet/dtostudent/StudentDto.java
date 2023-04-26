 package com.onerivet.dtostudent;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
	
	private int id;
	
    @NotEmpty(message = "not enter any firstname")
    @Size(max=10,min = 3,message = "not able to enter")
	private String firstName;
	
	@NotEmpty(message = "not empty anything lastname")
	@Size(max = 10 , min = 3, message = "not applicable")
	private String lastName;
	
	private String city;
	
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$",message = "Invalid Message")
	private String password;
	
	@Pattern(regexp="[6-9][0-9]{9}" ,message = "not proper")
	private String phoneNumber;
	
	@Min(value = 18)
	@Max(value = 65)
	private int age;
	
	@Email
	private String emailId;
	
	
}
