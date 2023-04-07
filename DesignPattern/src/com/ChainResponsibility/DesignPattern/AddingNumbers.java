package com.ChainResponsibility.DesignPattern;

public class AddingNumbers implements Chaintocall{
	
	private Chaintocall nextInChain;

	@Override
	public void setNextChain(Chaintocall nextChain) {
		this.nextInChain=nextChain;
		
	}

	@Override
	public void calculation(Numbers request) {
		//System.out.println(request.getcalc());
		if((request.getcalc()).equalsIgnoreCase("addition"))
		{
			System.out.println("The Addition as per your request : "+ request.getNum1() + "+" +request.getNum2() + "=" +(request.getNum1()+request.getNum2()) );
		}
		else
		{
			nextInChain.calculation(request);
		}
		
	}

}
