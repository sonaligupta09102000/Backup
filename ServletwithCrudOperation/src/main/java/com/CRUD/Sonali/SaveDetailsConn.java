package com.CRUD.Sonali;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SaveDetailsConn extends Conn{        //DAO [Data Access Object]
	
	public static int Insertsave(Users u,Connection conn)
	
	{
		
//		System.out.println(u);
//		System.out.println(conn);
		
		int status=0;
		try {
			
			//from this connection is get
			conn=Conn.getConne();
			
			PreparedStatement ps=conn.prepareStatement("insert into usersTable(ID,Name,EmailId,Password)values(?,?,?,?)");
			ps.setInt(1,u.getID());
			ps.setString(2, u.getName());
			ps.setString(3, u.getEmailID());
			ps.setString(4,u.getPassword());
			
			status=ps.executeUpdate();		
			
			conn.close();
			
		}catch(Exception e)
		{
			e.getStackTrace();
		}
		return status;
		
	}
	
	public static List<Users> GetAllUsers(Connection conn)
	 
	{
		List<Users> getall=new ArrayList<Users>();

		try {
			conn=Conn.getConne();
			PreparedStatement ps=conn.prepareStatement("select * From usersTable");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				Users u=new Users();
				u.setID(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setEmailID(rs.getString(3));
				u.setPassword(rs.getString(4));
				getall.add(u);
			}
			conn.close();
			
		}catch(Exception e)
		{
			e.getStackTrace();
		}
		return getall;
	}
	
	public static Users GetSingleUsersById(Connection conn,int iD)
	{
		Users u=new Users();
		try {
			
			conn=Conn.getConne();
			PreparedStatement ps=conn.prepareStatement("select*from usersTable where id="+iD);
			//ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				//Users u=new Users();
				u.setID(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setEmailID(rs.getString(3));
				u.setPassword(rs.getString(4));
			}
			
			conn.close();

		}catch(Exception e)
		{
			e.getStackTrace();
		}
		return u;
	}
	
	
	public static Users DeleteUserById(Connection conn, int iD)
	{
		Users u=new Users();
		try {
			conn=Conn.getConne();	
			PreparedStatement ps=conn.prepareStatement("delete from usersTable where id="+iD);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				u.setID(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setEmailID(rs.getString(3));
				u.setPassword(rs.getString(4));
			}
			conn.close();
			
		}catch(Exception e)
		{
			e.getStackTrace();
		}
		return u;
		
	}
	
	public static int UpdateUserById(Connection conn,Users u1)
	{
	    int status =0;	
		try {
			
			   conn=Conn.getConne();
			   PreparedStatement ps=conn.prepareStatement("update usersTable set Name=?,emailID=?,Password=? where ID=?");
			    ps.setInt(4,u1.getID());
				ps.setString(1, u1.getName());
				ps.setString(2, u1.getEmailID());
				ps.setString(3,u1.getPassword());
				
//			   ResultSet rs=ps.executeQuery();
//			   
//			   if(rs.next())
//			   {
//				   u.setID(rs.getInt(1));
//				   u.setName(rs.getString(2));
//				   u.setEmailID(rs.getString(3));
//				   u.setPassword(rs.getString(4));
//			   }
			   
			   
			   status=ps.executeUpdate();
			   return status;
			  // conn.close();
			
			
		}catch(Exception e)
		{
			e.getStackTrace();
		}
		
		return 0;
	}
}
