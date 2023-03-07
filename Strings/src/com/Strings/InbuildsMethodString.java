package com.Strings;

public class InbuildsMethodString {
	
	public static void main(String[] args) {
		
		String Q="SONALI RAJESHBHAI GUPTA";
		Q=Q.concat("\0");
		char a[]=Q.toCharArray();
		
		int count=0;
		int i=0;
		
		while(a[i]!='\0') {
			
			++count;
			++i;
		
		}
		
		System.out.println(count);
		
		
		
		
		
		
	}

}
