package com.Strings;

import java.util.Scanner;

public class FirstCharAsCaptipal {

	public static void main(String[] args) {
		
		String h;
		System.out.println("Enter Any String: ");
		Scanner sc=new Scanner(System.in);
		h=sc.nextLine();
		char b[]=h.toCharArray();
		int size=b.length;
		
		b[0]=(char)(b[0]-32);
		int i=1;
		while(i!=size)
		{
			if(b[i]==' ')
			{
				b[i+1]=(char)(b[i+1]-32);
			}
			++i;
			
		}
		System.out.println(b);
		
		
		
	}
}
