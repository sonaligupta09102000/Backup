package com.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollect {
	
	public static void main(String[] args) {
		
		List<String> productList=Arrays.asList("MacBook", "IPhone","Shoes","Batterycharger","Bat");
		
		System.out.println("--------------------------------------------------");
		System.out.println(productList);
		
		System.out.println("--------------------------------------------------");
		productList.forEach(ele->System.out.println(ele));
		
		System.out.println("--------------------------------------------------");
		productList.forEach(System.out::println);
		
		System.out.println("--------------------------------------------------");
		List<String> result=productList.stream().filter(ele->ele.equals("Bat")).collect(Collectors.toList());
		result.forEach(ele->System.out.println(ele));
		
		System.out.println("-------------------------------------------------");
		List<String> result1=productList.stream().filter(ele->!ele.equals("MacBook")).collect(Collectors.toList());
		result1.forEach(ele->System.out.println(ele));
		
	
	}

}
