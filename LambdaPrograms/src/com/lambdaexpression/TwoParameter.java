package com.lambdaexpression;

 interface Add {
	 
	 void add(int n1, int n2);
	
}
public class TwoParameter {
	public static void main(String[] args) {
		
	int u=8,i=90;
	
	Add f=(e,o)->{System.out.println(e/o);};
	Add g=(r,h)->{System.out.println(r-h);};
	
	f.add(u, i);
	g.add(u, i);
	
	}
	
	

}
