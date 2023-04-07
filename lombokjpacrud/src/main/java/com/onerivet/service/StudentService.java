package com.onerivet.service;



import java.util.List;
import java.util.Optional;

import com.onerivet.dtostudent.StudentDto;
import com.onerivet.entity.Student;



public interface StudentService {
	
	public String addstudent(StudentDto studentdto);
	
    public List<StudentDto> getall();
	
    public List<StudentDto> getbyId(int id);
    
    public String deleteall();
    
    public String deletebyid(int id);
    
    public String updatebyid(int id, StudentDto studentdto);

	

	
  
//	public Student getbyfName(String firstName);
//	
//	public List<Student> getallfName();
//	
//	public Student getbylName(String lastName);
//	
//	public List<Student> getalllName();
//	
//	public Student getbycity(String city);
//	
//	public List<Student> getallcity();
//	
//	public List<Student> getbyphoneno(String phoneNumber);
	
}
