package com.Strings;

public class CopyOneStringToAnother {
    public static void main(String[] args) {
		
    	String Y="HIMANSHU GUPTA";
    	char a[]=Y.toCharArray();
    	int size=Y.length();
    	char b[]= new char[size];
    	
    	int i=0;
    	
    	while(i!=size)
    	{
    		b[i]=a[i];
    		++i;
    		
    	}
    	
    	System.out.println(a);
    	System.out.println(b);
    	
	}
}
