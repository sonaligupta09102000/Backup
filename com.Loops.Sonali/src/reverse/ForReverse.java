package reverse;

public class ForReverse {
  public static void main(String[] args)
  {
	  int originalnumber=89564123;
	  int reverse=0;
	  {
	  for(;originalnumber!=0;originalnumber=originalnumber/10)
	  {
		  int remainder=originalnumber%10;
		   reverse=reverse*10+remainder;
	  }  
	  System.out.println("The reverse of the given number is:" +reverse);
      }  
   }
}
