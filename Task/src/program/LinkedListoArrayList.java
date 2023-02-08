package program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListoArrayList {
	
	public static void main(String[] args) {
		
		LinkedList<String> l1=new LinkedList<>();
		l1.add("Bombay");
		l1.add("America");
		l1.add("New York");
		l1.add("London");
		l1.add("South Korea");
		l1.add("China");

		System.out.println("The List in LinkedList are:" +l1);
		System.out.println("\n");
		
		List<String> l2=new ArrayList<>(l1);
		//Collections.sort(l2);
		
		System.out.println("The List in ArrayList are: " +l2);
		System.out.println("\n");
		
		Collections.sort(l2);
		//https://www.youtube.com/watch?v=StBSynRWI_U
		System.out.println("The List in ArrayList in sorted forms are: " +l2);
	}

}
