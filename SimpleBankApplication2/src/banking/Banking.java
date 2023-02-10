package banking;

import java.util.Scanner;


public class Banking extends Bank1 {
	public static void main(String[] args) {
		
		System.out.println("****************************************************************************");
	    System.out.println("Hello User.!!!!! " +" \n WELCOME TO THE BANK APPLICATION!!!.." + "\n For Further proccessing....Please Do the Needful!!....");
	    System.out.println("Press 1 For Further use  " + "Press 0 For Leave the application Immediately");
	    System.out.println("**********************************************************************************");
	    
	    int FirstPhase;
	    
	    Scanner input = new Scanner(System.in);
	    System.out.println("Input an integer");
	    int n1;
		while ((n1 = input.nextInt()) != 0) {
	      System.out.println("You entered " + n1);
	      
	      
	      Bank C=new Bank();
			
			if(n1==1)
			{
				C=new Bank();
				C.openAccount();
				
			}
			
	    do
	    	
	    {
	    	 System.out.println("Main Menu");
			 System.out.println("1. Display All");
			 System.out.println("2. Search By Account");
			 System.out.println("3. Deposit");
			 System.out.println("4. Withdraw");
			 System.out.println("5. Current Balance");
			 System.out.println("6. Exit");
			 
			 FirstPhase=input.nextInt();
			 switch(FirstPhase)
			 {
			 case 1:
				 
				 if(n1==1)
				 {
					 C.openAccount();
					 
				 }
				 
				 else
				 {
					 System.out.println("You can Exist..");
				 }
				 break;
				 
				 default:
					 System.out.println("you ar on the wrong path...");
			  
				 }
	    }while(FirstPhase!=0);
	    
		} System.out.println("Out of loop");	
	    
		}
		
	}

		
			 
			 
			 
			 
	    	
	    	
	    
	    
	    
		
		
		
	

	

