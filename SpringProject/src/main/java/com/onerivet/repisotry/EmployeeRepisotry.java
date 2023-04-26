package com.onerivet.repisotry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.onerivet.entity.Department;
import com.onerivet.entity.Emplyee;

public interface EmployeeRepisotry extends JpaRepository<Emplyee, Integer> {
	
	@Query("SELECT e FROM Emplyee e WHERE e.firstName=:fn")
	public List<Emplyee> getbyfirstname(@Param("fn") String firstName);

	@Query(value="SELECT d.department_name DeptName, emp_salary EmpSalary From emplyee e INNER JOIN  department d ON  d.department_id=e.id WHERE d. department_id=?",nativeQuery = true)
	public List<String> getbydepid(int id);
	
	@Query("SELECT d.department_name DeptName, d.emp_salary EmpSalary, e.firstName Fname, e.lastName Lname FROM Emplyee e JOIN e.department_details d WHERE e.id=:id")
	public List<String> getall(@Param("id") int id);
	
}


