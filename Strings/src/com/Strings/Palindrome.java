package com.Strings;

public class Palindrome {
	
	
	public static void main(String[] args) {
		
		String p="NayaN ";
		p=p.replace(" ", "");
		System.out.println(p);
		char y[]=p.toCharArray();
		int size=p.length();
		
		char z[]=new char[size];
		
		int i=0;
		while(i!=size)
		{
			z[size-i-1]=y[i];
			++i;
			
		}
		
		i=0;
		while(i!=size)
		{
			if(z[i]!=y[i])
			{
				System.out.println("The Entered String is not Palindrome!!..");
				System.exit(0);
			}
			else
			{
				++i;
				continue;
				
			}
			
			
		}
		
		System.out.println("The String is Palindrome");
		
	}

}
