package com.onerivet.repisotry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.onerivet.entity.Student;

public interface StudentRepio extends JpaRepository<Student, Integer>{
	
	@Query("SELECT s FROM Student s")
	public List<Student> FindAllStudent();
	
	@Query("SELECT s FROM Student s WHERE s.firstName=:n ")
	public List<Student> FindByName(@Param("n") String firstName);
	
	@Query("SELECT s FROM Student s WHERE s.lastName=:ln")
	public List<Student> FindByLName(@Param("ln") String lastName);
	
	@Query("SELECT s FROM Student s WHERE s.city=:c")
	public List<Student> FindByCity(@Param("c") String city);
	
	@Query("SELECT s FROM Student s WHERE s.firstName=:fn or s.lastName=:ln")
	public List<Student> findByFnameOrLname(@Param("fn") String firstName, @Param("ln") String lastName);
	
	@Query("SELECT s FROM Student s WHERE s.firstName=:fn and s.lastName=:ln")
	public List<Student> findByFnameAndLname(@Param("fn") String firstName,@Param("ln") String lastName);
	
	@Query("SELECT s FROM Student s WHERE s.firstName=:fn or s.lastName=:ln or s.city=:c")
	public List<Student> finByFnameorLnameorcity(@Param("fn") String firstName, @Param("ln") String lastName,@Param("c") String city);

	@Query("SELECT s FROM Student s WHERE s.id=:id")
	public List<Student> findbyid(@Param("id") int id);
	
	@Query("SELECT s FROM Student s WHERE s.emailId=:email")
	public List<Student> findbyemailid(@Param("email") String emailId);
	
	@Query("SELECT s FROM Student s WHERE s.age BETWEEN 18 AND 20")
	public List<Student> findbyage(int age,int age1);
	
	@Query("SELECT s FROM Student s WHERE s.age BETWEEN :value1 AND :value2")
	public List<Student> findbyage1(@Param("value1") int value1, @Param("value2") int value2);
	
	@Query("SELECT s FROM Student s ORDER BY s.firstName DESC")
	public List<Student> findinorder(String firstName);
	
	//@Query("SELECT s FROM Student s WHERE s.city IN('surendranagar')")
	@Query("SELECT s FROM Student s WHERE s.city IN :c ")
	public List<Student> findbyin(@Param("c") String city);
	
	@Query("SELECT s FROM Student s WHERE s.lastName LIKE 'g%' ")
	public List<Student> findbylike(String lastName);
}
