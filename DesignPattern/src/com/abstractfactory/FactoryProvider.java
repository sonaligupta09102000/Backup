package com.abstractfactory;

public class FactoryProvider {
 
	private Animal animal;
	private Color color;
	
	
	public FactoryProvider(AbstractFactory ab)
	{
		animal=ab.getanimal();
		color=ab.getColor();
	}
	
	public void getanimal()
	{
		animal.getAnimal();
		animal.makeSound();
	}
	
	public void getColor()
	{
		color.getColor();
	}
}
