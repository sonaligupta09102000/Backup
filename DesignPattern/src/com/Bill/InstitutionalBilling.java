package com.Bill;

import java.util.Scanner;

public class InstitutionalBilling implements BillingState {

	@Override
	public void getbill() {
		
//		double rate=2.90;
//		double units=90.8;
		double rate;
		double units;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Please enter the rate: ");
		rate=sc.nextDouble();
		
		System.out.print("Please enter the units: ");
		units=sc.nextDouble();
		System.out.println("The Total Ammount of InstitutionalBilling is: " + rate*units);
	
	}

}
