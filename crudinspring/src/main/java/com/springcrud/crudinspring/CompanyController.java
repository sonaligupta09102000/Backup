package com.springcrud.crudinspring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcrud.crudinspring.service.UserService;

@RestController
@RequestMapping("/company")
public class CompanyController {
	
	private static List<Company> comp=new ArrayList<Company>();
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/firststring")

		public String Display()
		{
			return userService.Dispaly();
		}
	
	@PostMapping("/addcomp")
	public String adddetails(Company c)
	{
//		comp.add(new Company(1,"ABC","abc@123gmail.com","acb"));
//		comp.add(new Company(2,"DFG","dfg@321gmail.com","jkl"));
		return userService.adddetails(c);
	}
	
	@GetMapping("/getcomp")
	public List<Company> getdetails()
	{
         return userService.getdetails();
	}
	
	@GetMapping("/getcomp/{id}")
	public Company getCompany(@PathVariable int id)
	{
		return userService.getCompany(id);
	} 
	
	@DeleteMapping("/delcomp/{id}")
	public String deleteCompany(@PathVariable int id)
	{
		return userService.deleteCompany(id);
	}
	
	@PutMapping("/updatecomp/{id}")
	
		public String updateCompany(@PathVariable int id,@RequestBody Company c)
    	{
			return userService.updateCompany(id, c);
		}
	}
	
		
		
	
	

