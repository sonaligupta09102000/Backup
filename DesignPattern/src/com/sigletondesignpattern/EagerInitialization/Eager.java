package com.sigletondesignpattern.EagerInitialization;

public class Eager {
	public static void main(String[] args) {
		
		
		
				 EagerInitialization e1=EagerInitialization.getInstance();
				 
				 EagerInitialization e2=EagerInitialization.getInstance();
				 
				 if(e1==e2)
				 {
					 //basically it is pointing to the memory address which is store in heap 
					 System.out.println("The Object are same");
				 }
				 else
				 {
					 System.out.println("The Objects are not same");
				 }
			}
	}

