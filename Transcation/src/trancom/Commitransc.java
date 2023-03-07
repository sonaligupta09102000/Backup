package trancom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Commitransc {
	
	Connection c =Conn.getConne();
	
	public static void main(String[] args) throws SQLException{
		
		try {
		
		Conn.setAutoCommit(false);
		
		
		String query1="INSERT INTO Bank(Name,Account_No,ID,Balance) VALUES ('Sonali',1234,12,9000)";
		String query2="INSERT INTO Bank(Name,Account_No,ID,Balance) VALUES ('Himanshu',2134,25,10000)";
		
		PreparedStatement stmt=Conn.prepareStatement();
		
		}
		
		
		
		
		
		
	}	
		
		
		
		
	}

}
