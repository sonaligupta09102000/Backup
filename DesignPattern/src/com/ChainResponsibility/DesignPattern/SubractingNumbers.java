package com.ChainResponsibility.DesignPattern;

public class SubractingNumbers implements Chaintocall{
	
	private Chaintocall nextInChain;

	@Override
	public void setNextChain(Chaintocall nextChain) {
		this.nextInChain=nextChain;
		
	}

	@Override
	public void calculation(Numbers request) {
		
		if((request.getcalc()).equalsIgnoreCase("subtraction"))
		{
			System.out.println("The Subtraction as per your request: " + request.getNum1() + "-" +request.getNum2()+ "=" +(request.getNum1()-request.getNum2()));
		}
		else
		{
			nextInChain.calculation(request);
		}
	}
}
