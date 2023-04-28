package com.authentication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.authentication.dtoentity.AuthorityDto;
import com.authentication.entity.Authority;
import com.authentication.repisotry.AuthorityRepisotry;

@Service
public class AuthorityImplies implements AuthorityService{
	
	@Autowired
	private AuthorityRepisotry authorityRepisotry;
	
	@Autowired
	private ModelMapper modelmapper;

	List<AuthorityDto> authoritydto=new ArrayList<>();
	
	//Entity to DTO
	private AuthorityDto AuthoritytoAuthoritydto(Authority authority)
	{
		AuthorityDto authoritydto=this.modelmapper.map(authority, AuthorityDto.class);
		return authoritydto;
	}
	
	     //DTO to Entity
		private Authority authoritydtotoAuthority(AuthorityDto authoritydto)
		{
			Authority authority=this.modelmapper.map(authoritydto, Authority.class);
			return authority;
		}
		
	
	
	@Override
	public String addAuthority(AuthorityDto authority) {
		
		authorityRepisotry.save(this.authoritydtotoAuthority(authority));
		return "Success";	
		}
	
	
	@Override
	public List<AuthorityDto> getall() {
		List<Authority> authority=authorityRepisotry.findAll();
		return authority.stream().map(this::AuthoritytoAuthoritydto).collect(Collectors.toList());
	}

}
