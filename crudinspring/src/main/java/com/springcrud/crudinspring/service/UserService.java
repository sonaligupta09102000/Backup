package com.springcrud.crudinspring.service;

import java.util.List;



import com.springcrud.crudinspring.Company;

public interface UserService {
	
	public String Dispaly();
	
	public String adddetails(Company c);
	
	public List<Company> getdetails();
	
	public Company getCompany(int id);
	
	public String deleteCompany(int id);
	
	public String updateCompany(int id,Company c);

}
