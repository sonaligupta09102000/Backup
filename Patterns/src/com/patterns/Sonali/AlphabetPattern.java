package com.patterns.Sonali;

public class AlphabetPattern {
	
	public static void main(String[] args) {
		
		int i,j;
		int alpha=65;
		
		for(i=0; i<=6; i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
			
}
}
