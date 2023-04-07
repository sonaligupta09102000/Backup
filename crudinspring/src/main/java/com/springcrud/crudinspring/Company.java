package com.springcrud.crudinspring;

public class Company {
	
	private int id;
	private String name;
	private String emailId;
	private String password;
	
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
	{
		this.id=id;
		this.name=name;
		this.emailId=emailId;
		this.password=password;
	}
	
	public Company()
	{
		super();
	}
	
	

	

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", emailId=" + emailId + ", password=" + password + "]";
	}
	
	
	

}
