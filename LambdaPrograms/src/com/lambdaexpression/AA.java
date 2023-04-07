package com.lambdaexpression;

interface Ab {
	
	public double getValue();
}

interface B {
	public int getInt(int i);
}
public class AA {

	public static void main(String[] args) {
		
		Ab Ab;
// Return 3.14 by lamda		
		Ab = ()-> 3.14;
//		B b=(5)->{
//			
//		}
//		b =(8)->{System.out.println(i);};
		B b;
		b = (i)->(i+5);
		System.out.println(b.getInt(78));
		 
		 
		 
// 
		
	}
}
