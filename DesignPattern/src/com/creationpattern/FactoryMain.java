package com.creationpattern;

import java.util.Scanner;

public class FactoryMain {
	
	public static void main(String[] args) {
		
		Laptopsmain lm=new Laptopsmain();
		
		String a;
		System.out.println("Enter any Msg ");
		Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
		Laptops lp=lm.GetLaptops(a);
		lp.LapInfo();
	}
}
