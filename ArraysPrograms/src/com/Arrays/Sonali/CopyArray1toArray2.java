package com.Arrays.Sonali;

public class CopyArray1toArray2 {
	
	public static void main(String[] args) {
		
		int a[]= new int[] {1,4,3,2,6,7};
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		
		System.out.println("The Original Arrays is");
		for(int i=0;i<a.length;i++)
		{
			
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		System.out.println("The New Arrays is");
		for(int i=0;i<b.length;i++)
		{
			
			System.out.print(b[i] + " ");
		}
		
	}

}
