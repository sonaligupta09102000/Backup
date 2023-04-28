package com.authentication.service;

import java.util.List;

import com.authentication.dtoentity.AuthorityDto;


public interface AuthorityService {
	
public String addAuthority(AuthorityDto authoritydto);
	
	public List<AuthorityDto> getall();
}
