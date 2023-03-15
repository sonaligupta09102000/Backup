package com.Arrays.Sonali;

public class RotateArraytoLeft {

	public static void main(String[] args) {
	   
     int arr[]= {1,2,3,6,5,4,3,2};
     System.out.print("Inputed Arrays were: ");
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.print(arr[i] + " ");
     }
     
     int first=arr[0];
     for(int j=0;j<arr.length-1;j++)
     {
    	 
    	 arr[j]=arr[j+1];
     }
     
     arr[arr.length-1]=first;
     
     System.out.println();
     
     System.out.print("Output Arrays were:  ");
     
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.print(arr[i] + " ");
     }
     
	}
}
