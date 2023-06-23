package com.springcrud.crudinspring.service;

import java.io.File;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrud.crudinspring.Company;
import com.springcrud.crudinspring.CompanyRepo;
import com.springcrud.crudinspring.Image;

@Service
public class UserImplies implements UserService {
	
	@Autowired
	private CompanyRepo companyRepo;
	
	List<Company> comp=new ArrayList<Company>();
	@Override
	public String Dispaly() {
	
		return "Hello";
	}

	@Override
	public String adddetails(Company c) {
		//List<Company> comp=new ArrayList<Company>();
		Company comp1=new Company();
//		comp.add(new Company(1,"ABC","abc@123gmail.com","acb"));
//		comp.add(new Company(2,"DFG","dfg@321gmail.com","jkl"));
//		comp.add(new Company(2,"sonali","sonali@321gmail.com","hjii"));
		
		comp.add(comp1.getId(),c);
		return "Success added";
	}
	
 public List<Company> getdetails()
 {
	return comp;
 }

@Override
public Company getCompany(int id) {

	Iterator itr = comp.iterator();
	while(itr.hasNext()) {
		Company c = (Company) itr.next();
		if(c.getId() == id && id!=0)
		{
			return c;
		}	
	}
	return null;
}

@Override
public String deleteCompany(int id) {
	Iterator itr = comp.iterator();
	while(itr.hasNext())
	{
		Company c=(Company) itr.next();
		if(c.getId()==id && id!=0)
		{
			itr.remove();
			//return c;
		}
	}
	return "Deleted Successfully";
}

@Override
public String updateCompany(int id, Company c) {
	
	 int i=0;	
		Company c1=new Company();
		Iterator itr=comp.iterator();
		while(itr.hasNext())
		{
	         c1=(Company) itr.next();
//             if(c1.getId()==id )
//		     {
// 	                break;
//		     }
          i++;
	}
		comp.set(i, c);
		return "Updated Succesfully";
    }

//@Override
//public void getImagePath(String name, Image encodedPath) {
//	
////		byte[] fileContent = FileUtils.readFileToByteArray(new File("src\\main\\resources\\static\\1.jpg"));
////		String encodedString = Base64.getEncoder().encodeToString(fileContent);
////		//System.out.println(encodedString);
//		//return encodedString;
//  Company company = companyRepo.findByName(name);
//  company.setImage(encodedPath);
//  companyRepo.save(company);
//	}
}


