package program;

import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListtoArray {
	
	public static void main(String[] args) {
		
		List<String> Arraylist1 = new ArrayList<>();
		
		//String[] = new String[Arraylist1.size()];
		
		Arraylist1.add("Coconut");
		Arraylist1.add("Pasta");
		Arraylist1.add("Milk");
		Arraylist1.add("Juicie");

		
		System.out.println("The Total Elements in ArrayList Are: " +Arraylist1);
		
		String[] arrayValues = Arraylist1.toArray(new String [Arraylist1.size()]);
		
//		for(String arrayValues1 : Arraylist1)
//		{
//			System.out.println(arrayValues1);   // Its is also  uses 
//		}
		
	      //arrayValues=Arraylist1.toArray(arrayValues);
	    
	     System.out.println("The Elements in Arrays: "+ Arrays.toString(arrayValues));	
	}
}
