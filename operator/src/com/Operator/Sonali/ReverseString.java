package com.Operator.Sonali;

public class ReverseString {
	
	public static void main(String[] args) {
		
//		StringBuffer r=new StringBuffer("Hello, Welcome To 1Rivet");  
//		System.out.println(r.reverse());
//		
//		StringBuilder ref=new StringBuilder("Sonali Gupta");
//		System.out.println(ref.reverse());
		
		int l,i;
		String r="Good Morning";
		String r1="";
		
		l=r.length();
			
		 for(i=l-1;i>=0;i--)
		 { 
		   r1=r1+r.charAt(i);
		 }
		  System.out.println(r1);
		  System.out.println(r);
		}
	}

