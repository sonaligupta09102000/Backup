package com.onerivet.repisotry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onerivet.entity.Student;

public interface StudentRepio extends JpaRepository<Student, Integer>{

	
}
