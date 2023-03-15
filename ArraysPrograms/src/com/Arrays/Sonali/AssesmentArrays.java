package com.Arrays.Sonali;

import java.util.Arrays;

public class AssesmentArrays {

	
		public static void main(String[] args) {
			
			int i=0;
			int j=0;
			int count=0;
			int[] arr1= {5,1,22,25,6,-1,8,10};
			int[] arr2= {1,6,-1,10};
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
		    int size1=arr1.length;
			int size2=arr2.length;
			
			System.out.print("The Array1 list is: ");
			for(i=0; i<size1;i++)	
			System.out.print( arr1[i]+" ");
			//System.out.print("  "+ "");
			
			System.out.println();
			System.out.print("The Array2 list is: ");
			for(j=0;j<size2;j++)
			System.out.print(arr2[j]+" ");
			
			if(arr2[j]==arr1[i]) {
				System.out.println(arr1[i]+ "It is a subsequence of" + arr2[j]);
				count++;
			}
			else
			{
				System.out.println("It is not a subsequence");
			}
			
			
//			for(int i=0; i<size1;i++)	
//			{
//				System.out.print( arr1[i]);
//				//System.out.print(" ");
//			
//			System.out.println(" ");
//			
//			System.out.print("The Array2 List is: ");
//			for(int j=0;j<size2;j++)
//			{
//				System.out.print(  arr2[j]);
//				System.out.print(" ");
//				
//				if(arr1[i]==arr2[j])
//				{
//					System.out.println("It is a subsequence");
//				}
//			}
//			}
//			
			
			
		}
		
}
		 
			

