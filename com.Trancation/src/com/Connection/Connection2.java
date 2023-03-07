//package com.Connection;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//
//public class Connection2 implements Service {
//	   Statement stmt;
//	   ResultSet rs;
//	  static Connection conn;
//	
//	  static Connection getConn()
//	  {
//	  	String url="jdbc:sqlserver://localhost:1433;database=Employee;encrypt=true;trustServerCertificate=true";
//	  	String username="sa";
//	  	String password="Admin#123";
//	  	
//
//	  try {
//	  	Connection conn=DriverManager.getConnection(url,username,password);
//	  	
//	  	System.out.println("Connection Successful!!....");
//	  	
//	  	
//	  }catch(Exception e)
//
//	  {
//	  	System.out.println("Connection Falied!!...");																																																																																																																											
//	  	e.printStackTrace();
//	  																												       
//	  }
//	  return conn;
//
//	  }
//	   
//	@Override
//	public void retriveAllUser() {
//	
//		
//		String data1="select * from EMP";
//		
//		try {
//	    //Statement stmt=Connectionc
//		Statement stmt=Conn.conn.createStatement();
////		stmt=conn.createStatement();
//		
//		rs=stmt.executeQuery(data1);
//		System.out.println("First_Name \t\t Last_Name \t\t ID \t\t City \t\t Salary");
//		
//		while(rs.next())
//		{
//			System.out.println(rs.getString(1));
//			System.out.println("\t \t"+rs.getString(2));
//			System.out.println("\t \t"+rs.getInt(3));
//			System.out.println("\t \t"+rs.getString(4));
//			System.out.println("\t \t"+rs.getInt(5));
//		}
//		
////		rs.close();
////		stmt.close();
////		conn.close();
//		
//		}catch(Exception exec)
//		{
//			exec.printStackTrace();
//			
//		}
//		
//		
//		
//
//	}
//
////	public void createUser() throws SQLException {
////		
////		System.out.println("Inserting Records in Database: ");
////		
////		String data1="INSERT INTO EMP VALUES(7,'Rim','Shekh','Navsari',23000,'Gujarat')";
////		stmt=conn.prepareStatement(data1);
////		stmt.executeUpdate(data1);
////		
////		System.out.println("Inserted records into table....");
////		
////	
////}
//	@Override
//	public void singleUser(int ID) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	
//	@Override
//	public void getAllUser() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void updateUser(int ID) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteUser(int ID) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void createUser(Connections user) throws SQLException {
//		// TODO Auto-generated method stub
//       System.out.println("Inserting Records in Database: ");
//		
//		String data1="INSERT INTO EMP VALUES(7,'Rim','Shekh','Navsari',23000,'Gujarat')";
//		stmt=conn.prepareStatement(data1);
//		stmt.executeUpdate(data1);
//		
//		System.out.println("Inserted records into table....");
//		
//	}
//}
