package com.Opps.Sonali;

class Bike{
	
	void run()
	{
		System.out.println("Running");
	}
	
}

class Splendor extends Bike
{
	void run()
	{
		System.out.println("Running safely with 60km...!");
	}
	
}
public class Polymorphism {
	
  public static void main(String[] args) {
	  
	Bike b = new Splendor();  //upcasting:-If the reference variable of parent class refers to the object of child class
	b.run();
}
	
}
	 	


