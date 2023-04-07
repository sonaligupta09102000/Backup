package com.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class A {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(4,5);
		List<Integer> l1=list.stream().map(x->x).collect(Collectors.toList());
		System.out.println(l1);
		
		List <Integer> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(102);
		
		Consumer<Integer> con = (n)->{System.out.println(n);};
		
		list2.forEach(con);
		list2.forEach(m->{System.out.println(m);});
// Supplier	
		getText(()->"java");
		
	}

	private static void getText(Supplier<String> st) {
		
		System.out.println(st.get()+" " + st.get().concat("abhishek"));
		
	}

}
