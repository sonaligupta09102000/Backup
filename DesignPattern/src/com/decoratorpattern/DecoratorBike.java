package com.decoratorpattern;

public class DecoratorBike implements Bike {
	
	private Bike bike;
	
	public DecoratorBike(Bike bike)
	{
		super();
		this.bike=bike;
	}

	@Override
	public void assemblebike() {
	
		bike.assemblebike();
		 
		
	}

}
