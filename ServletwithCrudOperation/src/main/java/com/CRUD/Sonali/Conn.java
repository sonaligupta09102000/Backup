package com.CRUD.Sonali;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {
	
	static Connection conn;
	public static Connection getConne()
	{
		Connection conn=null;   
	try {
		
		String url="jdbc:sqlserver://localhost:1433;database=Servregis;encrypt=true;trustServerCertificate=true";
		String username="sa";
	    String password="Admin#123";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		conn=DriverManager.getConnection(url, username, password);
		System.out.println("Connection Successful!!....");
		
		
	}catch(Exception e)

	{
		System.out.println("Connection Falied!!...");																																																																																																																											
		e.printStackTrace();																												       
	}
	return conn;

	}	
}
	
	
	
	


