package com.authentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authentication.dtoentity.AuthorityDto;
import com.authentication.repisotry.AuthorityRepisotry;
import com.authentication.service.AuthorityService;

@RestController
@RequestMapping("/authority")
public class AuthorityController {
	
	@Autowired
	private AuthorityService authorityService;
	
	@Autowired
	private AuthorityRepisotry authorityRepisotry;
	
	@PostMapping("/add-authority")
	public String addroles(@RequestBody AuthorityDto authoritydto)
	{
          authorityService.addAuthority(authoritydto);
          return "Success";
	}
	
	@GetMapping("/get-all")
	public List<AuthorityDto>  getallauthority()
	{
		return authorityService.getall();
	}

}
