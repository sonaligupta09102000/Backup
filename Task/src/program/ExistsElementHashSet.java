package program;

import java.util.HashSet;
import java.util.Set;

public class ExistsElementHashSet {
	
	public static void main(String[] args) {
		
		Set<Integer> set1=new HashSet<>();
		
		set1.add(89);
		set1.add(34);
		set1.add(9);
		set1.add(0);
		set1.add(35);
		
		System.out.println(" The Total element in HashSet are : " + set1);
		
		System.out.println("\n The Total element that was exists in HashSet are: " + set1.contains(20));
		
		System.out.println("\n The Total element that was exists in HashSet are: " + set1.contains(35));
	}
	
	

}
