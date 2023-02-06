package reverse;

public class ReverseString {
	public static void main(String[] args) {
		
	 int originalnumber=789043, reverse=0;
	 {
	   while(originalnumber !=0)    //reverse number program using while loop
	   {
		 int remainder=originalnumber%10;
		 reverse=reverse*10+remainder;
		 originalnumber=originalnumber/10;	
	   }
       System.out.println("The reverse number is:"+reverse);
     }
	}
}
