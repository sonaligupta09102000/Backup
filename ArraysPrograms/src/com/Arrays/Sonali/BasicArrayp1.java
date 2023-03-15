package com.Arrays.Sonali;

import java.util.Arrays;

public class BasicArrayp1 {
	
	public static void main(String[] args) {
		
	int a[]=new int[5];
	a[0]=9;
	a[1]=23;
	a[2]=1;
	a[3]=54;
	a[4]=8;
//	a[5]=89;
//	a[6]=76;
	Arrays.sort(a);
	for(int i=0;i<a.length; i++)
	System.out.println(a[i]);
		
	}

}
