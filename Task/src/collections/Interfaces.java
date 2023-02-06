package collections;

import java.util.*;

public class Interfaces {
	
	public static void main(String[] args) {
		
	ArrayList<String> list=new ArrayList<>();
	list.add("Hello" + " Everyone");
	list.add("I" + " Am" + " Intern");
	list.add("At" + " 1Rivet");
	
	System.out.println(list);
	System.out.println("\n");
	
	//using iterator function
	Iterator<String> it=list.iterator();
	while(it.hasNext()) {
		
		System.out.println(" iterator is  " + it.next());
		
	}
	
	//using for each function for iterator
	for(String List1:list)
	{
		System.out.println("for Each elements is" + List1);
		
	}
		
	for(int i=0;i<list.size();i++)
	{
		System.out.println("The Element is" + list.get(i));
	}
	
	}

}
