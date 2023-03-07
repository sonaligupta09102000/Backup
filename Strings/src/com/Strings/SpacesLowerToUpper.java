package com.Strings;

import java.util.Scanner;

public class SpacesLowerToUpper {
     
	public static void main(String[] args) {
		
        String n;
		System.out.println("Enter any String: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextLine();
		
		char b[]=n.toCharArray();
		int size=b.length;
		
		int i=0;
		while(i!=size)
		{
			if(b[i]!=' ')
			{
				b[i]=(char)(b[i]-32);
			}
			++i;	
		}
		System.out.println(b);
		
		
	}
}
