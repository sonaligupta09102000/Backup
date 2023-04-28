package com.securityspring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.securityspring.entity.Company;
import com.securityspring.service.UserService;



@RestController
@RequestMapping("/company")
public class CompController {
	
private static List<Company> comp=new ArrayList<Company>();
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/firststring")

		public String Display()
		{
			return userService.Dispaly();
		}
	
	@PostMapping("/addcomp")
	public String adddetails(@RequestBody Company c)
	{
		return userService.adddetails(c);
	}
	
	@GetMapping("/getcomp")
	public List<Company> getdetails(@RequestParam(value = "pageNumber",defaultValue = "2")int pageNumber, @RequestParam(value = "pageSize",defaultValue = "1")int pageSize,@RequestParam(value="sort",defaultValue = "name")String sort)
	
	{
         return userService.getdetails(pageNumber,pageSize, sort);
		}
	
	
	@GetMapping("/getcomp/{id}")
	public Optional<Company> getCompany(@PathVariable int id)
	{
		return userService.getCompany(id);
	} 
	
	@DeleteMapping("/delcomp/{id}")
	public String deleteCompany(@PathVariable int id)
	{
		return userService.deleteCompany(id);
	}
	
	@DeleteMapping("/delecom")
	public String deleteCompany()
	{
		return userService.deleteAll();
		
	}
	
	@PutMapping("/updatecomp/{id}")
	
		public String updateCompany(@PathVariable int id,@RequestBody Company c)
    	{
			return userService.updateCompany(id, c);
		}
	
	
	@GetMapping("/findbyname")
	
	public List<Company> findByName(String name)
	{
		return userService.findname(name);
		
	}

}
