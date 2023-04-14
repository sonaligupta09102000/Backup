package com.onerivet.stucontroller;

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


import com.onerivet.dtostudent.StudentDto;
import com.onerivet.entity.Student;
import com.onerivet.service.StudentService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/student")
	
 public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/addstu")
	public String addstudent(@Valid @RequestBody StudentDto studentdto)
	
	{
		studentservice.addstudent(studentdto);
		return "added";
		//StudentDto stuRequest=
	}
	
	@GetMapping("/getallstu")
	public List<StudentDto> getallstudent()
	{
		return studentservice.getall();
	}
	
	@GetMapping("/getbyid/{id}")
	public StudentDto getstubyid(@PathVariable int id)
	{
		return studentservice.getbyId(id);
	}
	
	@DeleteMapping("/deleteall")
	public String deleteallstu()
	{
		return studentservice.deleteall();
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deletestubyid(@PathVariable int id)
	{
		return studentservice.deletebyid(id);
	}
	
	@PutMapping("/updatestu/{id}")
	public String updatestubyid(@PathVariable int id,@RequestBody StudentDto studentdto)
	{
		studentservice.updatebyid(id, studentdto);
		return "Updated Succesfully";
		
	}
	
	@GetMapping("/getall")
	public List<StudentDto> getall()
	{
		return studentservice.findall();
	}
	
	@GetMapping("/getbyfname")
	public List<StudentDto> findbyfname(String firstName)
	{
		return studentservice.findByName(firstName);
	}
	
	@GetMapping("/getbylname")
	public List<StudentDto> findbylname(String lastName)
	{
		return studentservice.findByLname(lastName);
	}
	
	@GetMapping("/getbycity")
	public List<StudentDto> findbycity(String city)
	{
		return studentservice.findByCity(city);
	}
	
	@GetMapping("/getbyfnameorlname")
	public List<StudentDto> findbyfnameorlname(String firstName, String lastName)
	{
		return studentservice.findByfnameorlname(firstName, lastName);
	}
	
	@GetMapping("/getbyfnameandlname")
	public List<StudentDto> findbyfnameandlname(String firstName,String lastName)
	{
		return studentservice.findbyfnameandlname(firstName, lastName);
	}
	
	@GetMapping("/getbyfnameorlnameorcity")
	public List<StudentDto> findbyfnameorlnameorcity(String firstName, String lastName, String city)
	{
		return studentservice.findbyfnameorlnameorcity(firstName, lastName, city);
	}
	
	@GetMapping("/getbyid")
	public List<StudentDto> getbyid(int id)
	{
		return studentservice.findbyid(id);
	}
	
	@GetMapping("/findallbyid")
	public List<StudentDto> findbyid(@RequestParam int id)
	{
		return studentservice.findallbyid(id);
	}
	
	@GetMapping("/findbyemailid")
	public List<StudentDto> findbyemailId(String emailId)
	{
		return studentservice.findbyemail(emailId);
	}
	
	@GetMapping("/findbyage")
	public List<StudentDto> findbyage(@RequestParam  int age,@RequestParam int age1)
	{
		return studentservice.findbyage(age,age1);
	}
	
	@GetMapping("/findallbyage")
	public List<StudentDto> findallbyage(int value1, int value2)
	{
		return studentservice.findallage(value1, value2);
	}
	
	@GetMapping("/findallbyorder")
	public List<StudentDto> findinorder(String name)
	{
		return studentservice.findinorder(name);
	}
	
	@GetMapping("/findincity")
	public List<StudentDto> findin(String city)
	{
		return studentservice.findin(city);
	}
	
	@GetMapping("/findbylike")
	public List<StudentDto> findbylike(String lastName)
	{
		return studentservice.findbylike(lastName);
	}
}
