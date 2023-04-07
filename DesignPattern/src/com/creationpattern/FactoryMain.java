package com.creationpattern;

import java.util.Scanner;

public class FactoryMain {
	
	public static void main(String[] args) {
		
		Laptopsmain lm=new Laptopsmain();
		
		String a;
		System.out.println("Enter any Msg:  1.Performance    2.Quality      3.Price      4.Relaiable  ");
		Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
		Laptops lp=lm.GetLaptops(a);
		if(lp!=null)
		{
		  lp.LapInfo();
	    }
		else
		{
			System.out.println("Invalid Choice!!!");
		}
    }
}
