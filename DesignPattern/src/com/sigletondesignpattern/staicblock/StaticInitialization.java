package com.sigletondesignpattern.staicblock;

public class StaticInitialization {
	
	private static StaticInitialization theonlyInstance=null; 
	
	private  StaticInitialization()
	{
		
	}
	
	
	static 
	{
	  try {
	     theonlyInstance=new StaticInitialization();	
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }	
	}
	
	
	public static StaticInitialization getInstance()
	{
		return theonlyInstance;
	}

}
