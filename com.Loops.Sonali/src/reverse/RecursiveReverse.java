package reverse;

import java.util.Scanner;

public class RecursiveReverse {    //reverse number using recursive and user input method
	
	public static void ReverseNumber(int number)      
	{
		if(number<10)
		{
			
			System.out.println(number);
		}

	else
	{	
		System.out.print(number%10);
		ReverseNumber(number/10);
	}
}
	public static void main(String[] args)
	{
		System.out.println("Enter the number you want to reverse:");
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    System.out.println("The reverse of given number is: ");
	    ReverseNumber(num);
	}
}
