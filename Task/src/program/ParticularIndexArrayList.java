package program;

import java.util.ArrayList;

public class ParticularIndexArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> particularindex = new ArrayList<String>();
		
		particularindex.add("Selin");
		particularindex.add("Kiara");
		particularindex.add("Demir");
		particularindex.add("Sonkoy");
		particularindex.add("Serkan");
		
		System.out.println("The Total Elments in the ArrayList Are:" + particularindex);
		
		particularindex.add(2,"LeeMinHoo");
		
		System.out.println("\n The Elments now After adding elements at particular index are: "+ particularindex);
		
		
		
	}
	

	
	
}
