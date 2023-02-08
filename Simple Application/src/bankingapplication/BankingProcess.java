package bankingapplication;

import java.util.Scanner;
	
  class Bank
  {
      private String Name;
      private String Account_No;
      private int ID_No;
      //private String Account_Type;
      private Long Balance;
      
      Scanner sc = new Scanner(System.in);
     
      //method for open an existing account
      void openAccount()
      {
    	  System.out.println("Enter Your Name: ");
    	  Name=sc.next();
    	  
    	  System.out.println("Enter Your Account Number: ");
    	  Account_No=sc.next();
    	  
    	  System.out.println("Enter Your ID_No: ");
    	  ID_No=sc.nextInt();
    	  
    	  //System.out.println("Enter Your Account_Type: ");
    	  //Account_Type=sc.next();  
    	  
    	  System.out.println("Enter Your Balance: ");
    	  Balance=sc.nextLong();
      }
      
      void displayAccount()
      {
    	  System.out.println(Name + "," + Account_No + "," + ID_No + "," + "," + Balance);  
      }
      
      void deposit()
      {
    	Long Ammount;
    	
    	System.out.println("Enter the Total Ammount You want to Deposit In Your Account: ");
    	Ammount=sc.nextLong();
    	Balance=Balance+Ammount; 
      }
      
      void withdraw()
      {
    	  Long Ammount;
    	  
    	  System.out.println("Enter The Total Ammount You Want to Withdraw From Your Account:  ");
    	  
    	  Ammount=sc.nextLong();
    	  
    	  if (Balance>=Ammount)
    	  {
    		  Balance=Balance-Ammount;
    	  }
    	  else
    	  {
    		  System.out.println("Transaction Failed!!!..." + "Less Balance...");
    	  }
    		  	
      }
      
     public long getBalance()
     {
    	 return Balance;
     }
      
    	  boolean search(String accnum)
    	  {
    		  if(Account_No.equals(accnum))
    		  {
    			  displayAccount(); 
    			  return(true);
    	      }
    		  return(false);
    	  } 
  }
  
  public class BankingProcess {
	 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How Many Customers You Want to Input: ");
		int n=sc.nextInt();
		
		Bank C[]=new Bank[n];
		
		for(int i=0; i<C.length; i++)
		{
			C[i]=new Bank();
			C[i].openAccount();
			
		}
		
		int details;
		 do{
			 System.out.println("Main Menu");
			 System.out.println("1. Display All");
			 System.out.println("2. Search By Account");
			 System.out.println("3. Deposit");
			 System.out.println("4. Withdraw");
			 System.out.println("5. Current Balance");
			 System.out.println("6. Exit");
			 
			 
			 System.out.println("Enter Your Choice:");
			 
			 details=sc.nextInt();
			 
			 switch(details)
			 {
			 case  1: 
			   for(int i=0; i<C.length; i++)
			   {
				   C[i].displayAccount();
			   }
			   break;
			   
			 case 2:
				 System.out.println("Enter Account Number You want to Search: ");
				 String accnum=sc.next();
				 boolean found=false;
				 for(int i=0; i<C.length; i++)
				 {
					 found=C[i].search(accnum);
					 if(found)
					 {
						 break;
					 }
					 if(!found)
					 {
						 System.out.println("Serach Failed!.......The Account does not exists....");
					 }
				 }
			     break;
			     
			 case 3:
				 System.out.println("Enter Your Account Number: ");
				 accnum=sc.next();
			     found=false;
			     for(int i=0; i<C.length; i++)
			     {
			    	 found=C[i].search(accnum);
			         if(found)
			         {
			        	C[i].deposit();
			        	break; 
			         }
                     if(!found)
                     {
                      System.out.println("Search Failed!!.....The Account for the deposite does not exist....");
                     }
			     }
			     break;
			     
			 case 4:
				 System.out.println("Enter Your Account Number: ");
				 accnum=sc.next();
				 found=false;
				 for(int i=0; i<C.length; i++)
				 {
					 found=C[i].search(accnum);
					 if(found)
					 {
						 C[i].withdraw();
						 break;
					 }
					 if(!found)
					 {
						 System.out.println("Search Failed!!.... The Account for thr Withdraw does not exist....");
					 }
				 }
				 break;
				 
			 case 5:
				 System.out.println("Enter Your Account Number: ");
				 accnum=sc.next();
			     found=false;
			     for(int i=0; i<C.length; i++)
			     {
			    	 found=C[i].search(accnum);
			         if(found)
			         {
			        	C[i].getBalance();
			        	break; 
			         }
                     if(!found)
                     {
                      System.out.println("Search Failed!!.....The Account for the checking Balance does not exist....");
                     }
			     }
			     break;
				 
			 case 6:
                 			
				 break;
				 
         		 }
			 
		}
		while(details!=6);
	}

}
