package com.Arrays.Sonali;

public class FreequencyByNum {


	public static void main(String[] args) {
		
		int arr[]=new int[] {8,1,2,1,3,6,8,4,3,2};
		int freq[]=new int[arr.length];
		
		int visited=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
				  count++;
				  freq[j]=visited;
				}
			}
			
			if(freq[i]!=visited)
			{
				freq[i]=count;
			}
		}
		
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]!=visited)
			{
				System.out.println("Frequency of " + arr[i] + " : " + freq[i]);
			}
		}	
	}
}
