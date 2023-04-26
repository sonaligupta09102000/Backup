package com.filterexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	
    @GetMapping("/get")
	public String display(@RequestAttribute("Name") String  name )
	{
		return "hello" + name;
    	
    	
    			
	}
    
}