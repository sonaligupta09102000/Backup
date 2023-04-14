package com.sigletondesignpattern.threadsafe;

public class Thread {
	public static void main(String[] args) {
		
	
	
	ThreadSafe ts1=ThreadSafe.getInstance();
	
	ThreadSafe ts2=ThreadSafe.getInstance();
	
	ThreadSafe ts3=ThreadSafe.getInstance();
	
	ThreadSafe ts4=ThreadSafe.getInstance();
	
	
	if(ts1==ts2)
	{
		System.out.println("object create t1");
	}
	else if(ts2==ts3)
	{
		System.out.println("object created t2");
	}
	else if(ts3==ts4)
	{
		System.out.println("object created");
	}
	else
	{
		System.out.println("Not available to create object");
	}
	//System.out.println(ts1);
}
}
