package com.abstractfactory;

public class Duck implements Animal{

	@Override
	public void getAnimal() {
		System.out.println("Duck");
		
	}

	@Override
	public void makeSound() {
		System.out.println("Squeks");
		
	}

	

}
