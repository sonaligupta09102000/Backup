package com.authentication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authentication.dtoentity.UsersDto;
import com.authentication.entity.Users;
import com.authentication.repisotry.UserRepisotry;

@Service
public class UsersImpilies implements UserService {

	
	@Autowired
	private UserRepisotry userRepisotry;
	
	@Autowired
	private ModelMapper modelmapper;
	
	List<UsersDto> usersdto=new ArrayList<UsersDto>();
	
	//Entity to DTO
	private UsersDto UserstoUsersDto(Users users)
	{
		UsersDto usersdto=this.modelmapper.map(users, UsersDto.class);
		return usersdto;
	}
	
	//DTO to Entity
	private Users UsersDtotoUsers(UsersDto usersdto)
	{
		Users users=this.modelmapper.map(usersdto, Users.class);
		return users;
	}
	
	@Override
	public String addUsers(UsersDto users) {
		Users user1 = this.UsersDtotoUsers(users);
		//user1.getAuthorities().stream().map(x->)
		userRepisotry.save(user1);
	
		return "Success";
	}

	@Override
	public List<UsersDto> getallUsers() {
		List<Users> users = userRepisotry.findAll();
		//return users.stream().map((x)->modelmapper.map(users, UsersDto.class)).collect(Collectors.toList());
		return users.stream().map(this::UserstoUsersDto).collect(Collectors.toList());
	}

}
