package collections;

import java.util.HashSet;
import java.util.Set;

public class InitializeHashSet {
	
	public static void main(String[] args) {
		
		Set<String> list=new HashSet<>();
		
		list.add("Hello");
		list.add("Hey");
		list.add("Hyy");
		list.add("Heyyaa");
		
		System.out.println("The Total Elements in String are: " + list);
		
		Set<String> list1=new HashSet<>();
		
		list1.add("Friend");
		list1.add("Dost");
		list1.add("Friends");
		list1.add("Buddies");
		
		 list.addAll(list1);
		 
		 System.out.println("The Total Element that both list and list1 has are: " +list);
		
		
	}

}
