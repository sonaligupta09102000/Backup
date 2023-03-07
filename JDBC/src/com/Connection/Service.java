package com.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface Service {
	
	public void retriveAllUser();
	
	public void createUser(Connections user) throws SQLException;

	public void singleUser(int ID);
	
	public void getAllUser();
	
	public void updateUser(int ID);
	
	public void deleteUser(int ID);
	
	
	 
	
	
	
}
