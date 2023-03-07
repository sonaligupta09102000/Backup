package com.patterns.Sonali;

public class ReverseTrianglePattern {
	
	public static void main(String[] args) {
		
		int i,j;
		
		for(i=0;i<=4;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
