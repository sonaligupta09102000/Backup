package com.Arrays.Sonali;

import java.util.List;

public class SubsequenceArray {
	
	public static boolean isValidSubsequence(List<Integer> arr1, List<Integer> subsequencearr2 )
	{
		int index=0;
		for(int num:arr1)
		{
			if(num==subsequencearr2.get(index))
			{
				index++;
			}
			
			if(num==subsequencearr2.size())
				return true;
		}
		
		
		return false;
		
	}
		
	

}
