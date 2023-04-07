package com.abstractfactory;

public class Client {
	
	public static Client allCilent() {
		
		Client client;
		AbstractFactory ab;
		
		String animalName=System.getProperty("animal.name");
		if(animalName.contains("Animal")) {
			
			ab= new AnimalFactory();
		}
		else
		{
			ab=new ColorFactory();
		}
		
		client=new Client();
		return client;
		
		
	}
	
	public static void main(String[] args) {
		
		Client client=allCilent();
		((AbstractFactory) client).getanimal();
		((AbstractFactory) client).getColor();
	}
		
	}
	
	

	

