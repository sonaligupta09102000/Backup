package com.authentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authentication.dtoentity.UsersDto;
import com.authentication.service.UserService;

@RestController
@RequestMapping("/Users")
public class UsersController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/add-users")
	public String addUsers(@RequestBody UsersDto usersdto)
	{
		userService.addUsers(usersdto);
		return "Added Successfully";
	}
	
	
	@GetMapping("/get-users")
	//@PreAuthorize("hasAuthority('read') or hasRole('NORMAL')")
	public List<UsersDto> getUsers()
	{
		//Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return userService.getallUsers();
	}
	
}
