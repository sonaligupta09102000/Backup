package com.Strings;

import java.util.Scanner;

public class VowelsSpecialConsonant {

	public static void main(String[] args) {
		
		String s;
		System.out.println("Enter any String: ");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		char a[]=s.toCharArray();
		int size=a.length;
		
		int Vowecount=0;
		int Specialcount=0;
		int consonantcount=0;
		
		int i=0;
		while(i!=size)
		{
			 if(a[i]>='A' && a[i]<='Z')
			 {
				  ++consonantcount; 
			 }
			  if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u')
			  {
				  
				  ++Vowecount;
			  }
			  else
			  {
				  ++Specialcount;
				  
			  }	  
			
			++i;
		}
		
		System.out.println(a);
		System.out.println(consonantcount);
		System.out.println(Vowecount);
		System.out.println(Specialcount);
		
	}
}
