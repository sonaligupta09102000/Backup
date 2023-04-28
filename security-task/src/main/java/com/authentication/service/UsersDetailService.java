package com.authentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.authentication.config.SecurityUser;
import com.authentication.entity.Users;
import com.authentication.repisotry.UserRepisotry;


@Service
public class UsersDetailService implements UserDetailsService {

	@Autowired
	private UserRepisotry userRepisotry;
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		Users users = userRepisotry.getbyusername(name);
		
		if(users==null)
			{
				throw new UsernameNotFoundException("Could not find the users");
			}
		return new SecurityUser(users);
	}

}
