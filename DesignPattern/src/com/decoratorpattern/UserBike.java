package com.decoratorpattern;

public class UserBike {
	
	public static void main(String[] args) {
		
		Bike basicbike =new BasicBike();
		basicbike.assemblebike();
		
		System.out.println("*******************************************************************");
	
		Bike luxuryBike=new DecoratorBike(new LuxuryBike(basicbike));
		
		luxuryBike.assemblebike();
		
		System.out.println("********************************************************************");
		
		Bike sportsBike=new SportsBike(new BasicBike());
		sportsBike.assemblebike();
		
		System.out.println("*********************************************************************");
		
		Bike luxurysportsBike=new LuxuryBike(new SportsBike(new BasicBike()));
		luxurysportsBike.assemblebike();
		
	}

}
