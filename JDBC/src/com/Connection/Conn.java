//package com.Connection;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class Conn {
//	static Connection conn;
//	
//static Connection getConn()
//{
//	String url="jdbc:sqlserver://localhost:1433;database=Employee1;encrypt=true;trustServerCertificate=true";
//	String username="sa";
//	String password="Admin#123";
//	
//
//try {
//	Connection conn=DriverManager.getConnection(url,username,password);
//	
//	System.out.println("Connection Successful!!....");
//	
//	
//}catch(Exception e)
//
//{
//	System.out.println("Connection Falied!!...");																																																																																																																											
//	e.printStackTrace();
//																												       
//}
//return conn;
//
//}
// 
//}
//
//
