package com.iteratorpattern;

public class MainIterator {
	
	public static void main(String[] args) {
		
		IterateName in=new IterateName();
		
		for(Iterator it=in.getIterator(); it.hasNext();)
		{
		 
		String list=(String) it.next();
		
		System.out.println("names: " + list);
		}
	}

}
