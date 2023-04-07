package com.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpandMethodReferences {
	
	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Sonali","Selin","Tom","Rim");
		
		
		// by using simple for loop
		
		for(int i=0;i<names.size();i++)
			System.out.println(names.get(i));
		
		System.out.println("----------------------------------------------------------------");
		
		
		// by using for each loop
		
		for(String t:names)
		{
			System.out.println(t);
		}
		
		System.out.println("------------------------------------------------------------------");
		
		//System.out.println(names);
		//forEach is a Iterable class
		// 1. with Anonymous class
		
		names.forEach(new Consumer<String>() {   //Anonymous class

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		System.out.println("-------------------------------------------------------------------");
		
		//2. using Lambda function ->
		names.forEach(str->System.out.println(str));
		
		
		System.out.println("--------------------------------------------------------------------");
		
		
		//3. using Method References
		
		names.forEach(System.out :: println);
	}
}
