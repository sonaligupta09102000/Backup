package com.Bill;

import java.util.Scanner;

public class MainBilling  {
	
	public static void main(String[] args){
		
	    BillingFactory bf=new BillingFactory();
	    String b;
	    System.out.print("Enter the msg: ");
	    Scanner sc=new Scanner(System.in);
		b=sc.nextLine();
		BillingState bs=bf.getAllBill(b);
		
		if(bs!=null) 
		{
		    bs.getbill();
		}
		else
		{
			System.out.println("Invalid Choice");
		}
	}   
}
