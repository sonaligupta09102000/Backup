package com.ChainResponsibility.DesignPattern;

import java.util.Scanner;

public class TestAllChain {
	
	public static void main(String[] args) {
		
		Chaintocall chain1=new AddingNumbers();
		Chaintocall chain2=new SubractingNumbers();
		Chaintocall chain3=new MultiplingNumbers();
		Chaintocall chain4=new DividingNumbers();
		
		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
		chain3.setNextChain(chain4);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter num1: ");
		int num1=sc.nextInt();
		System.out.print("Please Enter num2: ");
		int num2=sc.nextInt();
		System.out.println("Please enter Request as per given string:" + "\n" +"1. addition" + "\n"  + "2. subtraction" + "\n" + "3. multiplication" + "\n" + "4. division");
		String gettingCalculation=sc.next();
		System.out.println("*************************************************************");
		Numbers request=new Numbers(num1 , num2, gettingCalculation);
		
		 chain1.calculation(request);
		
		
	} 

}
