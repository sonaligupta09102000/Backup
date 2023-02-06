package com.Oops_concepts.Sonali;

class Person{
	String name;
	int age;
	
	static int count;  //static keyword :- it is a class property or class object but not a object  
	
	public Person()
	{ 
		count++;
		System.out.println("creating a new object");
	}

	public Person(int newAge, String newName)
	{
		this();
		this.age=age;  // using this keyword we can use ek hi class ke dusre parameter ko access karne k liye 
		this.name=name;
		
//		age = newAge;
//		name=newName;
	
	}
	void walk()
	{
		System.out.println(name + " is walking");
	}
	
	void eat()
	{
		System.out.println(name + " is eating");
	}
	
	void walk(int steps)
	{
		System.out.println(name+" walked "+steps);
	}
}


public class Basics {
	
public static void main(String[] args) {
	
	Person p1=new Person();
	p1.age=23;
	p1.name="Sonali";
	
	
	Person p2=new Person();
	///Person p2=new Person(23,"dillop"); /// due to this constructor can call itself quickly
	p2.age=33;
	p2.name="Selin";
	
// System.out.println(p1.age+"  "+p1.name);
// 
// System.out.println(p2.age+"  "+p2.name);

	p1.eat();
//	p2.eat();
//	p1.walk();
	p2.walk();
	p1.walk(890765);
	
	System.out.println(Person.count);   //constructor count 
}





}
	
