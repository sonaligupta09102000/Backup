package collections;

import java.util.ArrayList;

public class InitializeArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> Initialize=new ArrayList<>();
		
		Initialize.add("Java");
		Initialize.add("Python");
		Initialize.add("C Programming");
		Initialize.add("C++");
		Initialize.add(".Net");
		Initialize.add("Web Programming");
		
		System.out.println("The Elements That a list of initialize have: " + Initialize);
		
		ArrayList<String> Initialize1=new ArrayList<>();
		
		Initialize1.add("Robotics");
		Initialize1.add("Mechanical Engineer");
		Initialize1.add("Computer Engineer");
		Initialize1.add("Chemical Engineer");
		Initialize1.add("Electrical Engineer");
		Initialize1.add("Biometrics");
		
		System.out.println("\n The Elements That a list of initialize1 have: " + Initialize1);
		
		Initialize.addAll(Initialize1);
		
		System.out.println("\n The Elements That Both List Initialize and Initialize1 have are: " + Initialize);
		
	}

}


