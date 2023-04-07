package com.lambdaexpression;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sorting {
	
	public static void main(String[] args) {
		
		//List<Integer> list=Arrays.asList(1,3,3,7,8,2,1);
		
		Set <Integer> list1=new HashSet<Integer>();
		list1.add(2);
		list1.add(5);
		list1.add(2);
		list1.add(60);
		list1.add(20);
		
		
		//List<Integer>f1=list1.stream().filter(x->(!list1.add(x))).collect(Collectors.toList());
		
		int f1=list1.stream().mapToInt(x->x.intValue()).sum();
		System.out.println("The Sum of list :" +f1);
		System.out.println("The Average of list: "+f1/list1.stream().count());
		
		
		long f2=list1.stream().count();
		System.out.println("The count of list:"+f2);
		
		
		List <Integer>l1=list1.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(l1);
		
	List<Integer> l3=list1.stream().map(t ->t*t).filter(t1->t1>100).collect(Collectors.toList());
	System.out.println("The no greater than 100: " +l3);
	int f3=l3.stream().mapToInt(t->t.intValue()).sum();
	System.out.println("The Sum of no greater than 100: "+f3);
	System.out.println("The Average of no greater than 100: " + f3/l3.stream().count());
		
		
	   // List<Integer>func=list.stream().sorted().distinct().collect(Collectors.toList());
	    
//	    List<Integer>func=list.stream().filter(x->re).sorted().collect(Collectors.toList());
//	    func.forEach(System.out::println);
   //System.out.println(func);

//		List<String> names=Arrays.asList("Sonali","Selin","Himanshu","Tom");
//		List<String>f1=names.stream().sorted().collect(Collectors.toList());
//		System.out.println(f1);
	}

}
