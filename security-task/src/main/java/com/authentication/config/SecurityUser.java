package com.authentication.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.authentication.entity.Authority;
import com.authentication.entity.Users;

import lombok.AllArgsConstructor;


public class SecurityUser implements UserDetails{

	
	private Users users;
	
	private String name;
	private String password;
	private List<GrantedAuthority> roleList;
	
	public SecurityUser(Users users) {
		this.users=users;
		name=users.getName();
		password=users.getPassword();
		//roleList=Arrays.stream(users.getAuthorities())
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<Authority> authorities = users.getAuthorities();
		List<GrantedAuthority> roleList=new ArrayList<>();
		
		for(var a:authorities)
		{
			
			roleList.add(new SimpleGrantedAuthority(a.getRole()));
//			if(a.isRole())
//			{
//				roleList.add(new SimpleGrantedAuthority("The ROLES:  " + a.getName()));
//			}
//			else
//			{
//				roleList.add(new SimpleGrantedAuthority(a.getName()));
//			}
		}
		return roleList;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return name;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
