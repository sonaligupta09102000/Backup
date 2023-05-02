package com.authentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authentication.dtoentity.AuthRequest;
import com.authentication.dtoentity.UsersDto;
import com.authentication.password.Password;
import com.authentication.service.JwtService;
import com.authentication.service.UserService;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
//	@Autowired
//    private Password password;
	

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Goa singham";
	}
	@PostMapping("/add-users")
	//@PreAuthorize("hasAuthority('write') or hasRole('ROLE_ADMIN')")
	public String addUsers(@RequestBody UsersDto usersdto)
	{
		userService.addUsers(usersdto);
		return "Added Successfully";
	}
	
	
	@GetMapping("/get-users")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public List<UsersDto> getUsers()
	{
		//Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return userService.getallUsers();
	}
	
	@PreAuthorize("hasRole('ROLE_USER')")
	@GetMapping("/message1")
	public String getMessage1() {
		return "Welcome to Valsad singham";
	}
	
	@PostMapping("/authentication")
	public String authenticateAndToken(@RequestBody AuthRequest authrequest)
	{
	//	System.out.println(authrequest.getName()+" "+ authrequest.getPassword());
		Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authrequest.getName(), authrequest.getPassword()));
		System.out.println(authenticate.isAuthenticated());
		
		if(authenticate.isAuthenticated())
		{
		    return jwtService.getToken(authrequest.getName());	
		}
		else
		{
			throw new UsernameNotFoundException("User is Not Authenticate!!!");
		}
	}
}
