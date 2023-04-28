package com.authentication.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.authentication.entity.Authority;
import com.authentication.entity.Users;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SecurityUser implements UserDetails{

	private Users users;
	
	
	
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
		return users.getPassword();
	}

	@Override
	public String getUsername() {
		return users.getName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}
