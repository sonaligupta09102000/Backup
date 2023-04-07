package com.abstractfactory;

public class ColorFactory implements AbstractFactory {

	@Override
	public Animal getanimal() {
		
		return new Bear();
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return new White();
	}

	
	
//	public Color getAll(String str)
//	{
//		if(str.equalsIgnoreCase("White"))
//			return new White();
//		
//		else if(str.equalsIgnoreCase("Black"))
//			return new Black();
//		
//		else if(str.equalsIgnoreCase("Brown"))
//			return new Brown();
//		
//		return null;
//		
//	}

}
