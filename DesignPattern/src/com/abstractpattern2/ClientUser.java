package com.abstractpattern2;

import com.abstractfactory.AbFactory;

public class ClientUser {
	
	public static Users allusers() {
		
		Users user;
		AbFactory factory;
		
		String osName=System.getProperty("os.name").toLowerCase();
		if(osName.contains("button")) {
			
			factory= new MacOSFactory();
		}
		else
		{
			factory=new WindowFactory();
		}
		
		user =new Users(factory);
		return user;
		
	}
	
	public static void main(String[] args) {
		
		Users user=allusers();
		user.click();
	}

}
