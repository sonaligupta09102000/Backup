package com.authentication.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import com.authentication.config.SecurityUser;
import com.authentication.entity.Users;
import com.authentication.repisotry.UserRepisotry;


@Component
public class UsersDetailService implements UserDetailsService {

	@Autowired
	private UserRepisotry userRepisotry;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users users = userRepisotry.findByname(username).get();
	     System.out.println(users.getName());
	     System.out.println(users.getPassword());
		
		
		return new SecurityUser(users);
		
		
	}

}
