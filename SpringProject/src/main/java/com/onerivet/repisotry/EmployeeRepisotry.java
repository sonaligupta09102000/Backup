package com.onerivet.repisotry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.onerivet.entity.Emplyee;

public interface EmployeeRepisotry extends JpaRepository<Emplyee, Integer> {
	
	@Query("SELECT e FROM Emplyee e WHERE e.firstName=:fn")
	public List<Emplyee> getbyfirstname(@Param("fn") String firstName);

}
