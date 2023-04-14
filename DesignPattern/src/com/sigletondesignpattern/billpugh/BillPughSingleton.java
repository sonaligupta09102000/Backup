package com.sigletondesignpattern.billpugh;

public class BillPughSingleton {

	  //private static BillPughSingleton theonlyInstance=new BillPughSingleton();
	  
	  private BillPughSingleton()
	  {
		  
	  }
	  
	  //inner class
	  private static class Bill{
		  
		  private static final  BillPughSingleton theonlyInstance=new BillPughSingleton();
		  
	  }
	  
	  public static BillPughSingleton getInstance()
	  {
		  return Bill.theonlyInstance;
	  }
	
}
