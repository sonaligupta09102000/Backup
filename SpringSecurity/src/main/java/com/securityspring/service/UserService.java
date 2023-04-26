package com.securityspring.service;

import java.util.List;
import java.util.Optional;
import com.securityspring.entity.Company;


public interface UserService {
	
    public String Dispaly();
	
	public String adddetails(Company c);
	
	public List<Company> getdetails();
	
	public Optional<Company> getCompany(int id);
	
	public String deleteCompany(int id);
	
	public String deleteAll();
	
	public String updateCompany(int id,Company c);
	
	public List<Company> findname(String name);

}
