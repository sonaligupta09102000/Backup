package com.sigletondesignpattern.EagerInitialization;

public class EagerInitialization {
	
	private static EagerInitialization theonlyInstance =new EagerInitialization();
	
	private EagerInitialization()
	{
		
	}
	
	public static EagerInitialization getInstance()
	{
		return theonlyInstance;
	}

}

