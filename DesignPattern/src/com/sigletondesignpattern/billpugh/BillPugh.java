package com.sigletondesignpattern.billpugh;

public class BillPugh {

	public static void main(String[] args) {
		
		BillPughSingleton bs1=BillPughSingleton.getInstance();
		
		BillPughSingleton bs2=BillPughSingleton.getInstance();
		
		System.out.println(bs1.hashCode());
		if(bs1==bs2)
		{
			System.out.println("Object Created ");
		}
		else
		{
			System.out.println("object not created");
		}
	}
}
