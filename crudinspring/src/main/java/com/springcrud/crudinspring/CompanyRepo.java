package com.springcrud.crudinspring;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<Company, Integer>{
	
	public Company findByName(String name);

}
