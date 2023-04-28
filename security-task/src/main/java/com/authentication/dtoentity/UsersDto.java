package com.authentication.dtoentity;

import java.util.Set;

import com.authentication.entity.Authority;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsersDto {
	
	private int id;
	private String name;
	private String password;
	private String emailId;
	private Set<Authority> authorities;
	
	

}
