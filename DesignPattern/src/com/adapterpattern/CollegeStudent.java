package com.adapterpattern;

public class CollegeStudent implements Student {
	
	private String name;
	private String surname;
	private String emailId;
	
	public CollegeStudent(String name,String surname,String emailId)
	{
		this.name=name;
		this.surname=surname;
		this.emailId=emailId;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getSurname() {
		return surname;
	}

	@Override
	public String getEmailId() {
		return emailId;
	}

}
