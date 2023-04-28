package com.authentication.dtoentity;

import java.util.Set;

import com.authentication.entity.Users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorityDto {
	
	private int id;
	//private String name;
	private String role;
	
}
