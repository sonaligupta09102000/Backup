package com.Arrays.Sonali;

import java.util.Scanner;

	class Frequency
	{
		int a[]=new int[10];
		int Key;
		
		void getdata()
		{
			Scanner sc=new Scanner(System.in);
			int i;
			System.out.print("Enter The Number you want: ");
			for(i=0;i<10;i++)
			{
				a[i]=sc.nextInt();
				//System.out.print(a[i] + " ");
			}
			System.out.print("Enter the value that you want to find frequency: ");
			Key=sc.nextInt();
			//System.out.print(Key);
		}
		
		void count()
		{
			int i,count=0;
			for(i=0;i<10;i++)
			{
				if(a[i]==Key)
				{
					count=count+1;
				}
			}	
		   System.out.println("The Total Frequency "+ count);
		}
	}
	
	public class FrequencyCount{
		
		public static void main(String[] args) {
			
			Frequency f1=new Frequency();
			
			f1.getdata();
			f1.count();
		}
	}

