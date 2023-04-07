package com.jdk8.stream.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsStringarraywithFlatMap {
	
	public static void main(String[] args) {

		String data[][]=new String[][] {
			
			{"Tom","Peter"},
			{"Mick","Steves"},
			{"John","Jill"},
			{"Tinki","Rimmy"}		
		};
		 
	
	   Stream<String[]> dataStream =  Arrays.stream(data);
	   Stream<String> streamFlatMap = dataStream.flatMap(x->Arrays.stream(x));
	   Stream<String> dataFilter = streamFlatMap.filter(x->"Tom".equals(x.toString()));
	   dataFilter.forEach(System.out::println);
	   
	}

}
