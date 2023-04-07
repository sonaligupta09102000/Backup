package com.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {
	 
	public static void main(String[] args) {
		
		List<Customer> customerList=Arrays.asList(
				new Customer("Tom",56),
				new Customer("Peter",42),
				new Customer("Steves",32),
				new Customer("Jim",28)
				);
		
		int name=customerList.stream().filter(x->"Tom".equals(x.getName())).map(Customer::getAge).findAny().orElse(null);
		System.out.println(name);
		
		System.out.println("--------------------------------------------------------------------------");
		
		//print all names from the list
		
		List<String> custList=customerList.stream().map(Customer::getName).collect(Collectors.toList());
		custList.forEach(System.out::println);
		
	}

}
