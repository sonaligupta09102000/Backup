package src.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.Scanner;

public class CallData implements Service {
	
static ResultSet rs;
static Statement st;
static PreparedStatement stmt;

User us =new User();

Scanner sc=new Scanner(System.in);



@Override
public void createUser(User us, Connection conn) {
	try {
	String query="CREATE TABLE Bank (\r\n"
			+ "  Name Varchar(20),\r\n"
			+ "  Account_No int,\r\n"
			+ "  ID int,\r\n"
			+ "  Balance int\r\n"
			+ ")";
	
	Statement ct=conn.createStatement();
	rs=ct.executeQuery(query);
	}catch(Exception e)
	{
		e.getStackTrace();
	}
	
}

	@Override
	public void retriveAllUser(Connection conn) {
	
		try {
			
			String query="SELECT *FROM Bank";
			Statement ct=conn.createStatement();
			rs=ct.executeQuery(query);
		System.out.println("---------------------------------------------------------------------------------------------------------------------");	
		System.out.println("Name \t\t\t\t  Accout_No \t\t\t\t ID \t\t\t\t  Balance");
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
		
	
		while(rs.next())
			{
				System.out.println("Name:" + rs.getString("Name") + "\t\t\t"+ "Account_No:"+ rs.getInt("Account_No")+ "\t\t\t" +"ID:" + rs.getInt("ID") +"\t\t\t\t" + "Balance:" + rs.getInt("Balance"));

			}
			
		}catch(Exception e)
		{
			e.getStackTrace();
			System.out.println("**********************************************************************************************************************************");
		}
	}
  
	public void insertUser(User us, Connection conn) {
		
		try {
			
			//conn.setAutoCommit(false);
			
			String query="INSERT INTO Bank(Name,Account_No,ID,Balance) VALUES (?,?,?,?)";
			PreparedStatement stmt=conn.prepareStatement(query);
			
			System.out.println("Please Enter the User Name");
			stmt.setString(1,sc.next());
			
			System.out.println("Please Enter Your Account_No");
			stmt.setInt(2, sc.nextInt());
			
			System.out.println("Please Enter Your ID");
			stmt.setInt(3, sc.nextInt());

			System.out.println("Please Enter Your Balance");
			stmt.setInt(4, sc.nextInt());
			
			
		  int rs= stmt.executeUpdate();
		  System.out.println(rs);
		  System.out.println("inserted...");
		  
		  
//		  String a;
//			 System.out.println("Please Enter Yes Or No for insert ");
//			  Scanner sc=new Scanner(System.in);
//			  a=sc.next();
//			  
//			  if(a.equals("Yes"))
//			  {
//				 conn.commit();
//			  }
//			  else
//			  {
//				  conn.rollback();
//			  }
//		  
		
		}catch(Exception e)
		{
			e.getStackTrace();
			System.out.println("********************************************************************************************************************************");
		}
		
	
		
	}

	
	@Override
	public User singleUser(User us,Connection conn) {
		
		try {
			
			System.out.println("Please Enter Your Id For Fetch Your Data...");
			int n=sc.nextInt();
			System.out.println("The ID Enter By you is:" + n);
					
			String query="SELECT *FROM Bank where ID=" +n;
			PreparedStatement stmt=conn.prepareStatement(query);
			rs=stmt.executeQuery();
			
			
			if(rs.next())
			{
				String Name=rs.getString("Name");
				int Account_No=rs.getInt("Account_No");
				int ID=rs.getInt("ID");
				int Balance=rs.getInt("Balance");
				
				System.out.println("Name:" +Name);
				System.out.println("Account_No:" +Account_No);
				System.out.println("ID:"+ID);
				System.out.println("Balance:" +Balance);
			}else
			{
				
				System.out.println("There No Records Available that you search....");
			}
			
			return us;
		}catch(Exception e)
		{
			e.getStackTrace();
			System.out.println("*************************************************************************************************************************************");
			
		}
		return us;
		
	}

	
	@Override
	public void updateUser(User us,Connection conn) {
		try {
			
        
		String query="UPDATE Bank SET Name=? Where ID=?";
		PreparedStatement stmt=conn.prepareStatement(query);
	
		 System.out.println("Enter the updated Name:");
		 stmt.setString(1,sc.next());
		 System.out.println("Enter Your ID For Update:");
		 stmt.setInt(2,sc.nextInt());	 
		 rs=stmt.executeQuery();
		 System.out.println(rs);
		
		}catch(Exception e)
		{
			e.getStackTrace();
			System.out.println("The Record is Updated...");
			System.out.println("*************************************************************************************************************************************");
		}
	}

	@Override
	public void deleteUser(User us,Connection conn) {
		try {
		
		String query="DELETE FROM Mem where ID=?";
		
		PreparedStatement stmt=conn.prepareStatement(query);
		
		System.out.println("Enter the ID For Delete:");
		stmt.setInt(1, sc.nextInt());
		
		rs=stmt.executeQuery();
		System.out.println(rs);
		
		
		}catch(Exception e)
		{
			
			e.fillInStackTrace();
			System.out.println("The Records has Deleted....");
		}
		
	}

	
	

	
}
