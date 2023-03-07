package com.Connection;

public class Connections {
	
	 
	private String First_Name;
	private String Last_Name;
	private int ID;
	private String Salary;
	private int City;
	private String address;
	

	public Connections() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.Last_Name = last_Name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		this.Salary = salary;
	}

	public int getCity() {
		return City;
	}

	public void setCity(int city) {
		this.City = city;
	}
	


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Connections First_Name=" + getFirst_Name()+ "\n" + "Last_Name=" + getLast_Name() + "\n" + "ID=" + getID() + "\n" + "Salary=" +getSalary()
				+"\n" + "City=" + getCity() +"\n" + "address=" +getAddress();
	}

	
	
	
	

}
