package com.securityspring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.securityspring.entity.Company;
import com.securityspring.repisotry.CompRepiso;


@Service
public class UserImplies implements UserService {

	@Autowired
	private CompRepiso comprepiso;
	
	List<Company> comp = new ArrayList<Company>();

	@Override
	public String Dispaly() {

		return "Hello";
	}

	@Override
	public String adddetails(Company c) {

		comprepiso.save(c);
		return "Added Successfully";
	}

	public List<Company> getdetails() {
		return comprepiso.findAll();

	}

	public Optional<Company> getCompany(int id) {

		return comprepiso.findById(id);

	}

	public String deleteCompany(int id) {
		comprepiso.deleteById(id);
		return "Deleted Sucessfully";
	}

	@Override
	public String updateCompany(int id, Company c) {
		try {
			Company com = comprepiso.findById(id).get();
			
			if (com != null) {
				c.setId(id);
//		  com.setName(c.getName());
//		  com.setEmailId(c.getEmailId());
//		  com.setPassword(c.getPassword());
				comprepiso.save(c);
				return "User Updated Successfully";
			}
		} catch (Exception e) {
			return "User not exiest ";
		}
		return "User not hcj ";
	}

	@Override
	public String deleteAll() {
		comprepiso.deleteAll();
		return "Deleted All Successfully";
	}

	@Override
	public List<Company> findname(String name) {
		
		return comprepiso.findByName(name);
	}

	

}



