package com.decoratorpattern;

public class LuxuryBike extends DecoratorBike {

	public LuxuryBike(Bike bike) {
		super(bike);
		
	}
	
	@Override
	public void assemblebike() {
		
		super.assemblebike();
		System.out.println("Adding Features of Luxury Bike!!.... ");
	}

}
