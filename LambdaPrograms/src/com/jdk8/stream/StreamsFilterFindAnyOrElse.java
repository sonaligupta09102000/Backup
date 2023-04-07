package com.jdk8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamsFilterFindAnyOrElse {
	
	public static void main(String[] args) {
		//List of Customer object:
		
		//1. filter-findAny
	List<Customer> customerList=Arrays.asList(
			new Customer("Tom",56),
			new Customer("Peter",42),
			new Customer("Steves",32),
			new Customer("Jim",28)
			);
	
	
        Customer customer=customerList.stream().filter(x->"Tom".equals(x.getName())).findAny().orElse(null);
		System.out.println(customer.getAge()+ " " + customer.getName());
	    System.out.println("------------------------------------------------------------------");
			
	//2. filter-did not findAny--OrElse
		Customer customer1=customerList.stream().filter(x->"Sonali".equals(x.getName())).findAny().orElse(null);
		System.out.println(customer1);
		System.out.println("-----------------------------------------------------------------------");
		
	//3. filter with multiple condition
		Customer customer2=customerList.stream().filter((x)->"Peter".equals(x.getName()) && 42==x.getAge()).findAny().orElse(null);
	    System.out.println(customer2.getName() + " " + customer2.getAge());
	    System.out.println("-------------------------------------------------------------------------");
	 
	 
	}

}
