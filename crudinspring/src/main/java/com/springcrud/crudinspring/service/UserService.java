package com.springcrud.crudinspring.service;

import java.util.List;



import com.springcrud.crudinspring.Company;
import com.springcrud.crudinspring.Image;

public interface UserService {
	
	public String Dispaly();
	
	public String adddetails(Company c);
	
	public List<Company> getdetails();
	
	public Company getCompany(int id);
	
	//public void getImagePath(String name,Image encodedPath);
	
	public String deleteCompany(int id);
	
	public String updateCompany(int id,Company c);

	//void getImagePath(String name, Image encodedPath);

}
