package com.Strings;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String a="Lee Min Hoon";
		char y[]=a.toCharArray();
		int size=a.length();
		
		char x[]=new char[size];
		
		int i=0;
		
		while(i!=size)
		{
			x[size-1-i]=y[i];
			++i;
			
		}
		
		System.out.println(x);
		System.out.println(y);
		
		
		
	}

}
