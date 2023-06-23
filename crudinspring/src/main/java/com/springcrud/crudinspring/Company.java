package com.springcrud.crudinspring;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Image")
public class Company {
	@Id
	private int id;
	private String name;
	private String emailId;
	private String password;
	//private Image image;
	
	public int getId()
	{
		return id;
	}
	
	

	public void setId(int id)
	{
		this.id=id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getEmailId()
	{
		return emailId;
	}
	
	public void setEmailId(String emailId)
	{
		this.emailId=emailId;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password=password;
	}

	public Company(int id, String name, String emailId, String password)
			//Image image) 
			{
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.password = password;
	//	this.image = image;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	
	
	

	
	
	

}
