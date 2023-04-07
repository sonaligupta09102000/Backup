package com.onerivet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onerivet.dtostudent.StudentDto;
import com.onerivet.entity.Student;
import com.onerivet.repisotry.StudentRepio;

@Service
public class StudentImplies implements StudentService {
	
	@Autowired
	private StudentRepio studentrepio;
	
	List<StudentDto> studentdto=new ArrayList<StudentDto>();
	
	@Override
	public String addstudent(StudentDto stu) {
		//DTO to Student
		studentrepio.save(StudentImplies.studentDtotoStudent(stu));
		return "success";
	}
	
	@Override
	public List<StudentDto> getall() {
		//Student to DTO
		List<Student> stu=studentrepio.findAll();
		return stu.stream().map(StudentImplies::studenttostudentdto).collect(Collectors.toList());
	}
	
	@Override
	public List<StudentDto> getbyId(int id) {
		//Student to DTO
		 Optional<Student> stu=studentrepio.findById(id);
		 return stu.stream().map(StudentImplies::studenttostudentdto).collect(Collectors.toList());
	}

	
	@Override
	public String deleteall() {
		studentrepio.deleteAll();
		return "SuccessFully Deleted All";
	}
	
	
	@Override
	public String deletebyid(int id) {
		studentrepio.deleteById(id);
		return "Successfully deleted by Id";
	}


	@Override
	public String updatebyid(int id, StudentDto stu) {
		Student stu1=this.studentrepio.findById(id).get();
		
		stu1.setFirstName(stu.getFirstName());
		stu1.setLastName(stu.getLastName());
		stu1.setCity(stu.getCity());
		stu1.setPassword(stu.getPassword());
		stu1.setPhoneNumber(stu.getPhoneNumber());
//		if(stu1!=null)
//		{
//			stu.setId(id);
//		}
		studentrepio.save(stu1);
		return "Updated Successfully";
	}

	
	
	//Entity to DTO Conversion
	public static StudentDto studenttostudentdto(Student stu)
	{
		StudentDto studentdto=new StudentDto();
		studentdto.setId(stu.getId());
		studentdto.setFirstName(stu.getFirstName());
		studentdto.setLastName(stu.getLastName());
		studentdto.setCity(stu.getCity());
		studentdto.setPassword(stu.getPassword());
		studentdto.setPhoneNumber(stu.getPhoneNumber());
		return studentdto;
		
	}
	
	
	//DTO to Entity Conversion
	public static Student studentDtotoStudent(StudentDto studentdto)
	{
		Student stu=new Student();
		stu.setId(studentdto.getId());
		stu.setFirstName(studentdto.getFirstName());
		stu.setLastName(studentdto.getLastName());
		stu.setCity(studentdto.getCity());
		stu.setPassword(studentdto.getPassword());
		stu.setPhoneNumber(studentdto.getPhoneNumber());
		return stu;
		
	}

	

	
	

	
	

}
