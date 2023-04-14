package com.onerivet.service;



import java.util.List;
import java.util.Optional;

import com.onerivet.dtostudent.StudentDto;
import com.onerivet.entity.Student;



public interface StudentService {
	
	public String addstudent(StudentDto studentdto);
	
    public List<StudentDto> getall();
	
    public StudentDto getbyId(int id);
    
    public String deleteall();
    
    public String deletebyid(int id);
    
    public String updatebyid(int id, StudentDto studentdto);
    
    public List<StudentDto> findall();
    
    public List<StudentDto> findByName(String firstName);
    
    public List<StudentDto> findByLname(String lastName);
    
    public List<StudentDto> findByCity(String city);
    
    public List<StudentDto> findByfnameorlname(String firstName, String lastName);
    
    public List<StudentDto> findbyfnameandlname(String firstName, String lastName);
    
    public List<StudentDto> findbyfnameorlnameorcity(String firstName, String lastName, String city);
    
    public List<StudentDto> findbyid(int id);
    
    public List<StudentDto> findallbyid(int id);
    
    public List<StudentDto> findbyemail(String emailId);
    
    public List<StudentDto> findbyage(int age,int age1);
    
    public List<StudentDto> findallage(int value1, int value2);
    
    public List<StudentDto> findinorder(String firstName);
    
    public List<StudentDto> findin(String city);
    
    public List<StudentDto> findbylike(String lastName);
}
