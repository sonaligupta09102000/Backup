package com.facadepattern;

import java.util.Scanner;

public class Foodies {
	
	public static void main(String[] args) {
		
		Resturant resturant=new Resturant();
		int details;
		do {
			System.out.println("Main Menu");
			System.out.println("1. Veg Menu");
			System.out.println("2. Non Veg Menu");
			System.out.println("3. Veg and Non Veg Both Menu");
			System.out.println("4. Exit");
			
			
			System.out.println("Enter your Choice");
			Scanner sc=new Scanner(System.in);
			details=sc.nextInt();
			System.out.println("**************************************************************");
			
			switch(details)
			{
			case 1:
			{
				resturant.getMenusVegMenu();
				System.out.println("**************************************************************");
			}
			break;
			
			case 2:
			{
				resturant.getMenusNoVegMenu();
				System.out.println("**************************************************************");
			}
			break;
			
			case 3:
			{
				resturant.getMenusVegNonVegBothMenu();
				System.out.println("**************************************************************");
			}
			break;
			
			case 4:
			{
				System.out.println("You may exit!...");
			}
		}	
	}while(details!=4);
		
	}
}
