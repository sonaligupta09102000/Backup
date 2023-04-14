package com.sigletondesignpattern.doublechecked;

public class Double {
	
	public static void main(String[] args) {
		
		DoubleCheckedSingleton dc1=DoubleCheckedSingleton.getInstance();
		
		DoubleCheckedSingleton dc2=DoubleCheckedSingleton.getInstance();
		
		if(dc1==dc2)
		{
			System.out.println("Objects are same");
		}
		else
		{
			System.out.println("Objects are not same");
		}
	}

}
