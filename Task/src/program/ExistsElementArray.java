package program;
 
import java.util.ArrayList;

public class ExistsElementArray {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> Exists = new ArrayList<>();
		
		Exists.add(789);
		Exists.add(345);
		Exists.add(789522);
		Exists.add(45);
		Exists.add(43);
		Exists.add(55);
		
		System.out.println("The Total Element in ArrayList is: " + Exists);
		
		System.out.println("\n The Existing Elements in ArrayList which has a value 45: "+ Exists.contains(45));
		
		System.out.println("\n The Existing Elements in ArrayList Which has value 21: "+ Exists.contains(21));
		
	}

}
