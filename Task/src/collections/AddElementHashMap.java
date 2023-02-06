package collections;

import java.util.HashMap;
import java.util.Map;

public class AddElementHashMap {
	
	public static void main(String[] args) {
		
		
		Map<String,String> charValues=new HashMap<>();
		
		charValues.put("One", "Hello");
		charValues.put("Two", "Hey");
		charValues.put("Three", "Hyaa");
		charValues.put("Four", "Byee");
		
		System.out.println(" The Keys Values Pairs that follows the String Datatypes are:  " + charValues);
	}

}
