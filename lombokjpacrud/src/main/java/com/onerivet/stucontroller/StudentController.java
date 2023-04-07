package com.onerivet.stucontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.onerivet.dtostudent.StudentDto;
import com.onerivet.entity.Student;
import com.onerivet.service.StudentService;


@RestController
@RequestMapping("/student")
	
 public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/addstu")
	public String addstudent(@RequestBody StudentDto studentdto)
	
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
	public List<StudentDto> getstubyid(@PathVariable int id)
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
}
