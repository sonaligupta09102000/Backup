package com.strings;

public class CountOfCharacter {
	
	public static void main(String[] args) {
		
		String str="Hello its sonali Gupta";
		System.out.println(getCharCount(str, 's'));
	}
	
	public static long getCharCount(String str, char c)
	{
		return str.chars().filter(e->(char)e==c).count();
		
	}
	
	public static long getCharCount(String str, char c1, char c2)
	{
		return str.chars().filter(e->(char)e==c1||e==c2).count();
		
	}

}
