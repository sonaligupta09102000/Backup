package com.Bill;

import java.util.Scanner;

public class CommericalBill implements BillingState {

	@Override
	public void getbill() {
//		double rate=3.50;
//		double unit=100;
		
		double rate;
		double unit;
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter the rate: ");
		rate=sc.nextDouble();
		System.out.print("Please Enter the units: ");
		unit=sc.nextDouble();
		 
		System.out.println("The Total Ammount of Commerical Billing is: " + rate*unit);
	}

}
