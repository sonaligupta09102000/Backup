package src.jdbc;

import java.sql.Connection;

public interface Service {
	
	
	
	public void insertUser(User us,Connection conn);
	
    public void retriveAllUser(Connection conn);
	
	public void createUser(User us, Connection conn);

	public User singleUser(User us,Connection conn);
	
	public void updateUser(User us,Connection conn);
	
	public void deleteUser(User us,Connection conn);
	

}
