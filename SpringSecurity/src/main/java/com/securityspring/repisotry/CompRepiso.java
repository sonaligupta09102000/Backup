package com.securityspring.repisotry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.securityspring.entity.Company;

public interface CompRepiso extends JpaRepository<Company, Integer> {
	
	public List<Company> findByName(String name);


}
