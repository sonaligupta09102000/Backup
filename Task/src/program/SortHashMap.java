package program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SortHashMap {
	
	public static void main(String[] args) 
	{	
	  Map<String,Integer> sortvalues=new HashMap<>();
	  
	  sortvalues.put("Apple",4);
	  sortvalues.put("Orange",8);
	  sortvalues.put("Pumkin",87);
	  sortvalues.put("Banana",9);
	  sortvalues.put("Chicku",34);
	    
	  for(Map.Entry<String,Integer> e:sortvalues.entrySet())
	  {
		 System.out.println("The Elements In Unsorted form are: "+e.getKey()); 
	  }
	  System.out.println("\n");
	  
	  Map<String,Integer> sortvalues1=new TreeMap<String, Integer>(sortvalues);
	  for(Map.Entry<String,Integer> e:sortvalues1.entrySet())
	  {
		   System.out.println("The Elements In Sorted form are: "+e.getKey());
		  //System.out.println(e.getKey() + ":" + e.getValue()); 
	  }
	  
	  // Sorting Based on HaspMap Values
	  
	  Set<Entry<String,Integer>> entryList=sortvalues.entrySet();
	  List<Entry<String,Integer>> l=new ArrayList<>(entryList);
 
	  Collections.sort(l,new Comparator<Map.Entry<String,Integer>>()
	  {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2)
			{
			   return o1.getValue().compareTo(o2.getValue());	
		    }
	  });
				
	System.out.println("\n"); 
	System.out.println("The Sorted HaspMap by Values are :");
	
       for (Entry<String, Integer> entry : l) {
		
    	   System.out.println(entry.getKey() + "\t" +entry.getValue());
	}  
  }
}
