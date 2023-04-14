package com.sigletondesignpattern.doublechecked;

public class DoubleCheckedSingleton {
	
	private static DoubleCheckedSingleton theonlyInstance=null;
	
	private DoubleCheckedSingleton()
	{
		
	}
	
	public static DoubleCheckedSingleton getInstance()
	{
		if(theonlyInstance==null)
		{
			synchronized (DoubleCheckedSingleton.class) {
				
				if(theonlyInstance==null)
				{
				    theonlyInstance=new DoubleCheckedSingleton();	
				}
			}
		}
		return theonlyInstance;
	}

}
