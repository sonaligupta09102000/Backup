package com.jspcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DaoDetails {
	

   //static int status;
   
	//1. Connection Dao1 
		
			
			public static Connection getConnection()
			
			{
				Connection conn=null;   
			try {
				
				String url="jdbc:sqlserver://localhost:1433;database=JspUser;encrypt=true;trustServerCertificate=true";
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
		
		
		
		//2. Insert DAO
		public static int Insertsave(Details ds) throws SQLException
		
		{

			int status=0;

				
				//from this connection is get
				Connection conn=DaoDetails.getConnection();
				// ds=new Details();
				PreparedStatement ps = conn.prepareStatement("insert into UserJsp(id,name,emailId,password)values(?,?,?,?)");
				ps.setInt(1, ds.getId());
				ps.setString(2, ds.getName());
				ps.setString(3, ds.getEmailId());
				ps.setString(4, ds.getPassword());
			
				status=ps.executeUpdate();		
				//System.out.println("hi");
				//conn.close();
				
		
			return status;
			
		}
		
		//3.Select DAO
		
		public static List<Details> GetAllUsers()
		 
		{
			List<Details> getall=new ArrayList<Details>();

			try {
				Connection conn=DaoDetails.getConnection();
				PreparedStatement ps=conn.prepareStatement("select * From UserJsp");
				ResultSet rs=ps.executeQuery();
				
				while(rs.next())
				{
					Details ds=new Details();
					ds.setId(rs.getInt(1));
					ds.setName(rs.getString(2));
					ds.setEmailId(rs.getString(3));
					ds.setPassword(rs.getString(4));
					getall.add(ds);
				}
				conn.close();
				
			}catch(Exception e)
			{
				e.getStackTrace();
			}
			return getall;
		}
		
		//4. Select By ID
		
		public static Details GetSingleUsersById(int id)
		{
			
			Details ds=new Details();
			try {
				
				Connection conn=DaoDetails.getConnection();
				PreparedStatement ps=conn.prepareStatement("select*from UserJsp where id=" + id);
				
				ResultSet rs=ps.executeQuery();
				
				if(rs.next())
				{
					
					ds.setId(rs.getInt(1));
					ds.setName(rs.getString(2));
					ds.setEmailId(rs.getString(3));
					ds.setPassword(rs.getString(4));
				}
				
				conn.close();

			}catch(Exception e)
			{
				e.getStackTrace();
			}
			return ds;
		}
		
		
		//5. Select By Name
		public static Details GetSingleUsersByName(String name)
		{
			
			Details ds=new Details();
			try {
				
				Connection conn=DaoDetails.getConnection();
				PreparedStatement ps=conn.prepareStatement("select*from UserJsp where name= '"+name+"'");
				
				ResultSet rs=ps.executeQuery();
				
				if(rs.next())
				{
					
					ds.setId(rs.getInt(1));
					ds.setName(rs.getString(2));
					ds.setEmailId(rs.getString(3));
					ds.setPassword(rs.getString(4));
				}
				
				conn.close();

			}catch(Exception e)
			{
				e.getStackTrace();
			}
			return ds;
		}
		
		//6. Delete By Id
		public static Details DeleteUserById(int id)
		{
			Details ds=new Details();
			try {
				Connection conn=DaoDetails.getConnection();
				PreparedStatement ps=conn.prepareStatement("delete from UserJsp where id="+id);
				ResultSet rs=ps.executeQuery();
				
				if(rs.next())
				{
					ds.setId(rs.getInt(1));
					ds.setName(rs.getString(2));
					ds.setEmailId(rs.getString(3));
					ds.setPassword(rs.getString(4));
				}
				conn.close();
				
			}catch(Exception e)
			{
				e.getStackTrace();
			}
			return ds;
			
		}
		
		
		//6. Update Details
		
		public static int UpdateUserById(Details ds)
		{
		    int status =0;	
			try {
				
				Connection conn=DaoDetails.getConnection();
				   PreparedStatement ps=conn.prepareStatement("update UserJsp set name=?,emailId=?,password=? where id=?");
				    ps.setInt(4,ds.getId());
					ps.setString(1, ds.getName());
					ps.setString(2, ds.getEmailId());
					ps.setString(3,ds.getPassword());
				
				   status=ps.executeUpdate();
				   return status;
				
				
					
			}catch(Exception e)
			{
				e.getStackTrace();
			}
			
			return 0;
		}
		
		
	}
		




