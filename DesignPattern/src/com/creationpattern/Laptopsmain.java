package com.creationpattern;

public class Laptopsmain {
	
	public Laptops GetLaptops(String str)
	{
		
		if(str.equals("Performance"))
			return new AcerLaptops();
		
		else if(str.equals("Quality"))
		    return new DellLaptops();
		
		else if(str.equals("Price"))
			return new LenovoLaptops();
		
		else if(str.equals("Relaiable"))
			return new HPLaptops();
		
		return null;
		 	 
	}

}
