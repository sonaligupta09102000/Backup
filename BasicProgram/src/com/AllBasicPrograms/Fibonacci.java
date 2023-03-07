package com.AllBasicPrograms;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
	
	
	int n,c;
    System.out.println("Enter Any Number:");
  
	Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int a=0;
    int b=1;
    System.out.println(a+ " ");
    System.out.println(b+ " ");
    
    for(int i=3;i<=n;i++)
    {
    	c=a+b;
    	System.out.println(c);
    	a=b;
    	b=c;
    }
    
    
    
	}

}
