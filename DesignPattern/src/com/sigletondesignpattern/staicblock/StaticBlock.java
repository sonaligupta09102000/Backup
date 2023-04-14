package com.sigletondesignpattern.staicblock;

public class StaticBlock {
	
	public static void main(String[] args) {
		
		StaticInitialization s1=StaticInitialization.getInstance();
		
		StaticInitialization s2=StaticInitialization.getInstance();
		
		if(s1==s2)
		{
			System.out.println("Objects are same");
		}
		else
		{
			System.out.println("Objects are not same");
		}
	}
}
