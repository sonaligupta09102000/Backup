package com.Operator.Sonali;

public class SplitsChar {
	public static void main(String[] args) {
		
	String s1="Hello Everyone How are you";
	String s2[]=s1.split("\\s");
	
	for(String x:s2)
	{
		System.out.println(x);
	}
  }
}
	

