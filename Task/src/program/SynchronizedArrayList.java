package program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
	
	public static void main(String[] args) {
		
		List<String> syncroList=Collections.synchronizedList(new ArrayList<String>());
		syncroList.add("JDK");
		syncroList.add("JRE");
		syncroList.add("JVM");
		syncroList.add("JDBC");
		syncroList.add("Hibernate");
		syncroList.add("Spring");
		
		System.out.println("The 1st way of Synchronized ArrayList By using method type are: ");
		synchronized(syncroList)
		{
			Iterator<String> it=syncroList.iterator();
			while(it.hasNext())
			{

				System.out.println(it.next());
			}
		}
		
		System.out.println("\n");
		
		CopyOnWriteArrayList<String> syncroList1=new CopyOnWriteArrayList<String>(syncroList);
		
		System.out.println("The 2nd way of Synchronized ArrayList By using class type are: ");
		
		Iterator<String> it=syncroList1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	

}
