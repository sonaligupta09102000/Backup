package com.Rivet.Spring;

public class Faculty {
	
	private int id;
	private String name;
	private String emailId;
	private String password;
	private FacultySubject subject;
	private Experience experience;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public FacultySubject getSubject() {
		return subject;
	}

	public void setSubject(FacultySubject subject) {
		this.subject = subject;
	}

	public Experience getExperience() {
		return experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", emailId=" + emailId + ", password=" + password + ", subject="
				+ subject + ", experience=" + experience + "]";
	}

	public Faculty(int id, String name, String emailId, String password, FacultySubject subject,
			Experience experience) {
	
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.subject = subject;
		this.experience = experience;
	}

	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
