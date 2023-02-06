package com.Operator.Sonali;

public class Logicop {  //main class
	
	public void test() {
		
		boolean human=false;
		if(!human)
		{
			
			System.out.println("I am human");
				
		}
		else
		{
			
			System.out.println("I am not a human");
			
		}
		
		System.out.println("\n");
		
		// && operators (true && true=true, false && true=false, true && false=false, false && false= false)
		int number = 6;
		
		if(number%2==0 && number%3==0)
		{
			
			System.out.println(number+ "is completely divisible by 2 and 3 both");
		}
		else
		{
			
			System.out.println(number+ "is not completely divisible by 2 and 3 both");
		} 
		
		System.out.println("\n");
		// || operator (true || true =true, false || false=false, false || true=true, true || false=false )
		if(number%2==0 || number%3==0)
		{
			System.out.println(number+ "is divisible by 2 or 3");
			
		}
		else
		{
			
			System.out.println(number+ "is not divisible by 2 or 3");
		}
		
		System.out.println("\n");
		
		// ^ (exclusive OR operator) [true ^ false=true, false^true=true, true^true=false, false^false=false)
		if(number%2==0 ^ number%2==0)
		{
			
			System.out.println(number+ "is divisible by 2 or 3 but not the both");
		}
		
		else
		{
			
			System.out.println("Its not supported");
		}
		
		System.out.println("\n");
		
}
	
	public void arithmetic()
	{
	int num1,num2;
	num1=25;
	num2=67;
	
	/*num1+=num2;
	num1-=num2;
	num2*=num1;
	num2/=num1;
	num1%=num2;
	
	System.out.println(num1);
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num2);
	System.out.println(num1);
	*/
	
	
	System.out.println(num1+num2);
	System.out.println(num1-num2);
    System.out.println(num1*num2);
	System.out.println(num1/num2);
	System.out.println(num1%num2);
	System.out.println("\n");
	}
	
	
	public void prepos()
	{
		int num=12;
		 System.out.println("\n");
		 System.out.println("number is 12" );
		num++;
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
		
		
		System.out.println("\n");
		++num;
		System.out.println(num);
		System.out.println(++num);
		System.out.println(num);
		
		System.out.println("\n");
		num--;
		System.out.println(num);
		System.out.println(num--);
		System.out.println(num);
		
		
		System.out.println("\n");
		--num;
		System.out.println(num);
		System.out.println(--num);
		System.out.println(num);
	}
		
	
	public void concat()
	{
		 String name="sonali ";
		 name+="rajeshbhai ";
		 name=name.concat("gupta");
		 name=name.toUpperCase();
		 System.out.println(name);
		 name=name.toLowerCase();
		 System.out.println(name);
		 System.out.println("\n"); 
		
	}
	
	
	public void escapetype()
	{
		String message;
		message="Hello Everyone \n Just pay aatendence \n As this is a \"important\" message";
		System.out.println(message);
		System.out.println("\n");
	}
	
   public void comparison()
   {
	   int num1,num2;
	   num1=200;
	   num2=188;
	   System.out.println(num1>num2);
	   System.out.println(num1<num2);
	   System.out.println(num1>=num2);
	   System.out.println(num1<=num2);
	   System.out.println(num1==num2);
	   System.out.println(num1!=num2);
	   System.out.println("\n");
	   
   }
   
   public void condition()
   {
	   int age=25;  //age1=30;
	   
	   
	   if(age>=18) //||age1>=18)
	   {
		   System.out.println("Welcome to the dance clue!! Don't forget to do that cool move!!!!");
	   }
	   else
	   {
		   System.out.println("Go home Kido");
	   }
	   
	   System.out.println("dancing is a fun");
	   System.out.println("\n");
   }
   public void cases()
   {
	   char grade='L';
	   switch(grade)
	   {
	   
	   case 'A':
	   System.out.println("Your grade is very good");
	   break;
	   
	   case 'B':
	   System.out.println("very good, keep learning");
	   break;
	   
	   case 'C':
	   System.out.println("Nice keep going");
	   break;
	   
	   case 'D':
	   System.out.println("Need Improvement");
	   break;
	   
	   default:
		 System.out.println("Wrong argument");
		 System.out.println("");
	   }   
   }
	
   public void loops()
   {
//	   for(int i=0; i<10; i++)
//	   System.out.println("Sonali");
       
	   int a=23;
//	   while(true)
//	   {
//		   System.out.println(a);
//		   a++;
//		   if(a>100) {
//			   break;
//		   }
//	   }
	   // while(a>100) cannot print this because the loops goes out  
	   
//	   	while(a<=100)
//	   	{
//	   		System.out.println(a);
//	   		a++;
//	   	}
	   
	   do
	   {
		   System.out.println(a);  //do while loop executes atleast once 
		   a++;
	   }while(a>100); //if this condition false or true but the upper condition was executes
    
	   
	   while(a<100) {
        a++;
        if(a==65) continue;
        System.out.println(a);
        System.out.println("\n");
	   }  
   }
   
  public void arr()
  {
//	   int marks[]=new int[5];  ///method 1 
//	   marks[0]=22;
//	   marks[1]=23;
//	   marks[2]=34;
//	   marks[3]=76;
//	   marks[4]=99;
//	   
//	   for(int i=0;i<marks.length;i++)
//	   {
//		   System.out.println(marks[i]);
//	   }
//	   
////	   for (int i : marks) {   // for each loop
////		   
////		   System.out.println(i);	
////	} 
	  
	  
	  int marks[]= {88,89,87,65,32,34,56};  // method 2
	  for(int i=0; i<marks.length; i++)
	  {
		  System.out.println(marks[i]);
		  System.out.println("\n");
	  }
	  
   }
   
  public void dimension()
  {
	///  int a[][]=new int [2][3];  // 2 rows & 3 columns /method 1
	int a[][] = {{1,2},{1,3}} ;
	System.out.println(a[0][0]);
	  
	
	  
  }
  
   //System.out.println(average(3,6));
  //System.out.println((average(2,6));
  //method
  
  //returnType functionName (arguments) {}
  
  //static in average (int firstNumber, int secondNumber);
  //int sum = firstNumber + secondNumber;
  //return sum/2;

	public static void main(String[] args)  // method 
	{
		
		Logicop operator=new Logicop();   // class object [classname.newobjname=new class name]
		operator.test();  //calling statement [new object name. method name ]
		//Logicop operator1=new Logicop();
		operator.arithmetic();
		operator.prepos();
		operator.concat();
		operator.escapetype();
		operator.comparison();
		operator.condition();
		operator.cases();
		operator.loops();
		operator.arr();
		operator.dimension();
}

	
	}