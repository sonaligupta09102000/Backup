package com.authentication.service;

import java.util.List;

import com.authentication.dtoentity.UsersDto;

public interface UserService {
	
	public String addUsers(UsersDto usersdto);
	
	public List<UsersDto> getallUsers();
	

}
