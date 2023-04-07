package com.ChainResponsibility.DesignPattern;

public class Numbers {
	
	private int num1;
	private int num2;
	
	private String gettingCalculation;
	
	
	
	public Numbers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Numbers(int num1, int num2, String gettingCalculation) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.gettingCalculation = gettingCalculation;
	}

	public int getNum1()
	{
		return num1;
	}
	
	public void setNum1(int num1)
	{
		this.num1=num1;
	}
	
	public int getNum2()
	{
		return num2;
	}

	public String getcalc()
	{
		return gettingCalculation;
	}
}
