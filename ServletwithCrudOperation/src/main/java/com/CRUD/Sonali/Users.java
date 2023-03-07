package com.CRUD.Sonali;

public class Users {
	
	private int ID;
	private String Name;
	private String EmailID;
	private String Password;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		this.ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		this.EmailID = emailID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	
	@Override
	public String toString() {
		return "Users [ID=" + ID + ", Name=" + Name + ", EmailID=" + EmailID + ", Password=" + Password + "]";
	}
}
