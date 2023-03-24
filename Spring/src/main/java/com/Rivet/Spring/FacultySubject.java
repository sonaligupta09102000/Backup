package com.Rivet.Spring;

public class FacultySubject {
	
	
  private String subject;

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}
  
public FacultySubject(String subject) {
	super();
	this.subject = subject;
}

public FacultySubject() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "FacultySubject [subject=" + subject + "]";
}
}
