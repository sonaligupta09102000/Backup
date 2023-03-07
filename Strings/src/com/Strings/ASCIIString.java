package com.Strings;

import java.util.Scanner;

public class ASCIIString {
	
	public static void main(String[] args) {
		
		String x;
		System.out.println("Enter Any String: ");
		Scanner sc=new Scanner(System.in);
		x=sc.nextLine();
		x=x.replace(" ","");
		System.out.println(x);
		char a[]=x.toCharArray();
		int size=a.length;
		
		int i=0;
		while(i!=size)
		{
			a[i]=(char)(a[i]-32);
			++i;
		}
		
	
		System.out.println(a);
		
		
		
		
		
		
		
		
		
	}

}
