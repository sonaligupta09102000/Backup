package com.Loops.Sonali;

public class Loopcontrol {
	
	public void Loopif()
	{
		int X=90;
		int Y=89;
		
		if(X+Y>50)
		{
			System.out.println("X+Y is greater than the given value");
		}
		
	}
	
	
	public void Loopifelse()
	{
		int Z=77;
	
		if(Z>50)
		{
			System.out.println("Z is valid ");	
		}
		
		else
		{
			System.out.println("Z is not valid");
		}
		
	}

	
	public void Loopifelseelse()
	{
		int W=90;
		int Q=33;
		
		if(W>234)
		{
			System.out.println("W is valid for this statement");
		}
		else if(W>88)
		{
			
			System.out.println("Its is going out of range");
		}
		else if(Q==W)
		{
			System.out.println("Both are equally");
		}
		else
		{
			System.out.println("Nothing is matching");
			
		}
		
	}
	
	
	public void Loopifelseelseif()
	{
		String city="Navsari";
		if(city=="Meerut")
		{
			System.out.println("city is Meerut");
		}
		else if(city=="South Korea")
		{
			System.out.println("city is korea");
		}
		else if(city=="Surat")
		{
			System.out.println("city is surat");
		}
		else
		{
			System.out.println(city);
		}
			
	}
	
//	public void Loop1()
//	{
//		String address="Navsari,India";
//		
//	
//		
//		
//	}
	
public static void main(String[] args) {
	
	Loopcontrol lc=new Loopcontrol();
	
	lc.Loopif();
	lc.Loopifelse();
    lc.Loopifelseelse();
	lc.Loopifelseelseif();
 


} 

   }

