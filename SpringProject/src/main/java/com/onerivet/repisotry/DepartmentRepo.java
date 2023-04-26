package com.onerivet.repisotry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onerivet.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
