package com.patterns.Sonali;

public class SideTriangle {
	
	public static void main(String[] args) {
		
		int i,j,k;
		
		for(i=1;i<=4;i++)      //outer loop row
		{
			for(k=3;k>=i;k--)   //for space loop
			{
				System.out.print(" ");
			}
			
			for(j=1; j<=i; j++) //inner loop columns
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
