package com.onerivet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onerivet.dtostudent.StudentDto;
import com.onerivet.entity.Student;
import com.onerivet.localexception.Resourcenotfound;
import com.onerivet.repisotry.StudentRepio;

@Service
public class StudentImplies implements StudentService {
	
	@Autowired
	private StudentRepio studentrepio;
	
	@Autowired
	private ModelMapper modelMapper;
	
	List<StudentDto> studentdto=new ArrayList<StudentDto>();
	
	@Override
	public String addstudent(StudentDto stu) {
		//DTO to Student
		studentrepio.save(this.studentDtotoStudent(stu));
		//studentrepio.save(StudentImplies.studentDtotoStudent(stu));
		return "success";
	}
	
	@Override
	public List<StudentDto> getall() {
		//Student to DTO
		List<Student> stu=studentrepio.findAll();
		return stu.stream().map((x)->modelMapper.map(stu,StudentDto.class)).collect(Collectors.toList());
		//return stu.stream().map(StudentImplies::studenttostudentdto).collect(Collectors.toList());
	}
	
	@Override
	public StudentDto getbyId(int id) {
		//Student to DTO
		 Student stu=studentrepio.findById(id).orElseThrow(()->new Resourcenotfound("User not found by" + id ));
		 return this.studenttostudentdto(stu);
		 //return stu.stream().map((x)->modelMapper.map(stu,StudentDto.class)).collect(Collectors.toList());
		 //return stu.stream().map(StudentImplies::studenttostudentdto).collect(Collectors.toList());
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
	
	@Override
	public List<StudentDto> findall() {
		
		List<Student> findAll = studentrepio.findAll();
		return findAll.stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
		
		//return this.studentrepio.findAll().stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
		
	}

	@Override
	public List<StudentDto> findByName(String firstName) {
		
		List<Student> findByName = studentrepio.FindByName(firstName);
		return findByName.stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
		
		//return this.studentrepio.FindByName(firstName).stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
	}
	
	@Override
	public List<StudentDto> findByLname(String lastName) {
		
		List<Student> findByLName = studentrepio.FindByLName(lastName);
		return findByLName.stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
		
		//return this.studentrepio.FindByLName(lastName).stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
	}

	
	@Override
	public List<StudentDto> findByCity(String city) {
		
		List<Student> findByCity = studentrepio.FindByCity(city);
		return findByCity.stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
		
		//return this.studentrepio.FindByCity(city).stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
		
	}
	

	@Override
	public List<StudentDto> findByfnameorlname(String firstName, String lastName) {
		
		List<Student> findByFnameOrLname = studentrepio.findByFnameOrLname(firstName, lastName);
		return findByFnameOrLname.stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
		
		//return this.studentrepio.findByFnameOrLname(firstName, lastName).stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
		
	}
	
	@Override
	public List<StudentDto> findbyfnameandlname(String firstName, String lastName) {
		
		List<Student> findByFnameAndLname = studentrepio.findByFnameAndLname(firstName, lastName);
		return findByFnameAndLname.stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
		
		 //return this.studentrepio.findByFnameAndLname(firstName, lastName).stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
	}
	
	@Override
	public List<StudentDto> findbyfnameorlnameorcity(String firstName, String lastName, String city) {
		
		List<Student> finByFnameorLnameorcity = studentrepio.finByFnameorLnameorcity(firstName, lastName, city);
		return finByFnameorLnameorcity.stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
		
		//return this.studentrepio.finByFnameorLnameorcity(firstName, lastName, city).stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
		
	}


	@Override
	public List<StudentDto> findbyid(int id) {
		
		List<Student> findbyid = studentrepio.findbyid(id);
		return findbyid.stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
		
		//return this.studentrepio.findbyid(id).stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
	}
	
	@Override
	public List<StudentDto> findbyemail(String emailId) {
		
		List<Student> findbyemailid = studentrepio.findbyemailid(emailId);
		return findbyemailid.stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
		
		//return this.studentrepio.findbyemailid(emailId).stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
		
	}
	
	@Override
	public List<StudentDto> findbyage(int age,int age1) {
		
		List<Student> findbyage = studentrepio.findbyage(age, age1);
		return findbyage.stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
		
		//return this.studentrepio.findbyage(age, age1).stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
	}
	
	
	//Entity to DTO Conversion
	//public static StudentDto studenttostudentdto(Student stu)
	private StudentDto studenttostudentdto(Student stu) 
	{
		
		StudentDto studentdto=this.modelMapper.map(stu,StudentDto.class);
		return studentdto;
//		StudentDto studentdto=new StudentDto();
//		studentdto.setId(stu.getId());
//		studentdto.setFirstName(stu.getFirstName());
//		studentdto.setLastName(stu.getLastName());
//		studentdto.setCity(stu.getCity());
//		studentdto.setPassword(stu.getPassword());
//		studentdto.setPhoneNumber(stu.getPhoneNumber());
//		return studentdto;
	}
	
	
	//DTO to Entity Conversion
	//public static Student studentDtotoStudent(StudentDto studentdto)
	private Student studentDtotoStudent(StudentDto studentdto)
	{
		Student stu=this.modelMapper.map(studentdto, Student.class);
		return stu;
//		Student stu=new Student();
//		stu.setId(studentdto.getId());
//		stu.setFirstName(studentdto.getFirstName());
//		stu.setLastName(studentdto.getLastName());
//		stu.setCity(studentdto.getCity());
//		stu.setPassword(studentdto.getPassword());
//		stu.setPhoneNumber(studentdto.getPhoneNumber());
//		return stu;
	}

	@Override
	public List<StudentDto> findallbyid(int id) {
		List<Student> findbyid = studentrepio.findbyid(id);
		return findbyid.stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
		
		//return this.studentrepio.findbyid(id).stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
		
	}

	@Override
	public List<StudentDto> findallage(int value1, int value2) {
		List<Student> findbyage1 = studentrepio.findbyage1(value1, value2);
		return findbyage1.stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
		
		//return this.studentrepio.findbyage1(value1, value2).stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
	}

	@Override
	public List<StudentDto> findinorder(String firstName) {
        List<Student> findinorder = studentrepio.findinorder(firstName);
        return findinorder.stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
        
		//return this.studentrepio.findinorder(firstName).stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
	}

	@Override
	public List<StudentDto> findin(String city) {
		List<Student> findbyin = studentrepio.findbyin(city);
		return findbyin.stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
		
		//return this.studentrepio.findbyin(city).stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
	}

	@Override
	public List<StudentDto> findbylike(String lastName) {
        List<Student> findbylike = studentrepio.findbylike(lastName);
        return findbylike.stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
        
		//return studentrepio.findbylike(lastName).stream().map(x->studenttostudentdto(x)).collect(Collectors.toList());
	}

	
}
