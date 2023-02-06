package collections;

import java.util.HashMap;
import java.util.Map;
//import java.util.Map.Entry;

public class SortHashMap {
	
	public static void main(String[] args) {
		
	  Map<String,Integer> sortvalues=new HashMap<>();
	  
	  sortvalues.put("Hello",4);
	  sortvalues.put("Hey",8);
	  sortvalues.put("Hyy",87);
	  sortvalues.put("heya",9);
	  sortvalues.put("Byee",34);
	  
	  System.out.println("The Elements In HashMap Are: "+ sortvalues);
	  
//	  for(Map.Entry<String,Integer> e:sortvalues.entrySet())
//	  {
//	     System.out.println(e.getValue());
//	   	
//	}

   }
}
