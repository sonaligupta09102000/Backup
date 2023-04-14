package com.sigletondesignpattern.lazyinitialization;

public class LazyInitialization {
	
	private static LazyInitialization theonlyInstance=null;
	
	private LazyInitialization()
	{
		
	}
	
	
	public static LazyInitialization getInstance()
	{
		if(theonlyInstance==null)
		{
			theonlyInstance=new LazyInitialization();
		}
		return theonlyInstance;
	}

}
