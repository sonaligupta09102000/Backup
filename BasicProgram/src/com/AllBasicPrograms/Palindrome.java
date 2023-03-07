package com.AllBasicPrograms;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		 int n,c,rem,sum=0;
		 System.out.println("Enter Any Number: ");
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 c=n;
		 
		while(n>0)
		 {
			 rem=n%10;
			 sum=(sum*10)+rem;
			 n=n/10;  
		 }
		if(c==sum)
		{
			System.out.println("The Entered Number is Palindrome!!...");
		}
		else
		{
			System.out.println("The Entered Number is not Palindrome!!!...");
		}
	}
}
