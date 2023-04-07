package com.decoratorpattern;

public class SportsBike extends DecoratorBike{

	public SportsBike(Bike bike) {
		super(bike);
		
	}
	@Override
	public void assemblebike() {
		
		super.assemblebike();
		System.out.println("Adding Features of a SportsBike!!...");
	}

}
