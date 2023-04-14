package com.sigletondesignpattern.threadsafe;

public class ThreadSafe {
	
	private static ThreadSafe theonlyInstance=null;
	
	private ThreadSafe()
	{
		
	}
	
	public static synchronized ThreadSafe getInstance()
	{
		if(theonlyInstance==null)
		{
			theonlyInstance=new ThreadSafe();
		}
		return theonlyInstance;
	}

}
