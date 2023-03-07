package com.Jdbc1.Sonali;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConn {
public static void main(String[] args) {
	

	String url="jdbc:sqlserver://localhost:1433;database=Employee;encrypt=true;trustServerCertificate=true";
	String username="sa";
	String password="Admin#123";
	try {
	Connection con=DriverManager.getConnection(url,username,password);
	System.out.println("success");
}
	catch(Exception e){
		
		System.out.println("Failed");
	}
}
}


