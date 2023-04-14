package com.sigletondesignpattern.lazyinitialization;

public class LazyMain {
	
	public static void main(String[] args) {
		
		LazyInitialization l1=LazyInitialization.getInstance();
		
		LazyInitialization l2=LazyInitialization.getInstance();
		
		if(l1==l2)
		{
			System.out.println("The LazyInitialization Objects are same");
		}
		else
		{
			System.out.println("The LazyInitialization Objects are not same");
		}
	}

}
