package com.ChainResponsibility.DesignPattern;

public class DividingNumbers implements Chaintocall{
	
	private Chaintocall nextInChain;

	@Override
	public void setNextChain(Chaintocall nextChain) {
		this.nextInChain=nextChain;
		
	}

	@Override
	public void calculation(Numbers request) {
 
		if((request.getcalc()).equalsIgnoreCase("division"))
		{
			System.out.println("The Division as per your request: " + request.getNum1() + "/" + request.getNum2() + "=" + (request.getNum1()/request.getNum2()));
		}
		
		else
		{
			System.out.println("It is no working" + "\n" +"please use add,sub,multi,div for result");
		}
		
	}

}
