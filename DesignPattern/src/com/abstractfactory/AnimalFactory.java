package com.abstractfactory;

public class AnimalFactory implements AbstractFactory {

	@Override
	public Animal getanimal() {
		
		return new Dog();
		
	}
	

	@Override
	public Color getColor() {
		
		return new Black();
	}
 
	
	

	
//	@Override
//	public Animal create(String str) {
//		if("Dog".equalsIgnoreCase(str))
//		return null;
//	}
	
//	public Animal getAll(String str)
//	{
//		if(str.equalsIgnoreCase("Dog") && str.equalsIgnoreCase("Brak"))
//			return new Dog();
//		
//		else if(str.equalsIgnoreCase("Duck") && str.equalsIgnoreCase("Squeak"))
//			return new Duck();
//		
//		else if(str.equalsIgnoreCase("Bear") && str.equalsIgnoreCase("b"))
//			return new Bear();
//		
//		return null;
//		
//		
//	}

	

	
	
}