package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class InterateSet {
	
	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<>(); 
		set.add(123);
		set.add(134);
		set.add(2);
		set.add(67);
		
		System.out.println("The Total Elements in HashSet Are :" + set);
		
		Iterator<Integer> it=set.iterator();
		
		while(it.hasNext())
		{
		System.out.println("\n After iterator The element in HashSet are :" + it.next());
		
	    }
    }
}
