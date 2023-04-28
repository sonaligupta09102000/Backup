package com.filterexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
    @GetMapping
	public String display(String name)
	{
    	
    	System.out.println("      " +name);
		return  """
				{
				  "message":"this a deskbook api"
				}
				""";
    	
    	
    			
	}
    
}