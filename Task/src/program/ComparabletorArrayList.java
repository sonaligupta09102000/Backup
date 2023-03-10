package program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

 class Laptop implements Comparable<Laptop>
{
	  int Ram;
	  String Brand;
	  int Price;
	 
	  
	 Laptop(int ram, String brand, int price) {
		
		this.Ram = ram;
		this.Brand = brand;
		this.Price = price;
	}
	

	public int getRam() {
		return Ram;
	}
	public void setRam(int ram) {
		this.Ram = ram;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		this.Brand = brand;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		this.Price = price;
	}
	@Override
	public String toString() {
		return "Laptop [Ram=" + Ram + ", Brand=" + Brand + ", Price=" + Price + "]";
	}


	@Override
	public int compareTo(Laptop sorts1) {
		
		if(this.getRam()>sorts1.getRam())
			return 1;
		else
			return -1;
		
	}
	 
}

public class ComparabletorArrayList {
	
	
	public static void main(String[] args) {
		
		ArrayList<Laptop> sorts= new ArrayList<Laptop>();
		
		sorts.add(new Laptop(90,"Dell",200));
		sorts.add(new Laptop(677,"Whirpool",900));
		sorts.add(new Laptop(934,"Samsung",1000));
		sorts.add(new Laptop(555,"Vivo",800));
		
		System.out.println("The ArrayList are: " +sorts);
		System.out.println("\n");
		
		Iterator<Laptop> it=sorts.iterator();
		while(it.hasNext())
		{
			System.out.println("The ArrayList are: " + it.next());
			
		}
		System.out.println("\n");
		Collections.sort(sorts);
		
		for(Laptop l: sorts)
		{
			System.out.println(l);
		}
		
	}
} 
