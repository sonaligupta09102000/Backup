package statements;

public class Statementloops {
	
//	public void BreakExample()
//	{
//		for(int i=0;i<10;i++) {
//		if(i==8)
//		{
//			break;
//		}
//		System.out.println(i);
//		}
//	}
	
//	public void BreakExample2()
//	{
//		for(int i=1;i<10;i++)
//		{
//			for(int j=1;j<10;j++)
//			{
//				if(i==7 && j==7)
//				{
//					break;
//				}
//				
//				System.out.println(i+" "+j);
//			}
//		}
//	}
	
//	public void BreakExample3()
//	{
//		aa:
//			for(int i=0;i<6;i++)
//			{
//				bb:
//				for(int j=0;j<6;j++)
//				{
//					if(i==4 && j==4)
//					{
//						break bb;
//						
//					}
//					System.out.println(i+" "+j);
//				}
//				
//			}
//		
//		
//	}
	
//	public void BreakWhileStatement()
//	{
//		int i=1;
//		while(i<=9)
//		{
//			if(i==4)
//			{
//				i++;
//				break;
//			}
//	       System.out.println(i);
//	       i++;
//		}
//		
//	}
//	

	
	public void ForEachExample()
	{
		int arr[]= {1,77,55,66,43};
		for(int i:arr)
		{
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		
		Statementloops ls=new Statementloops();
//		ls.BreakExample();
//		ls.BreakExample2();
//	    ls.BreakExample3();
//		ls.BreakWhileStatement();
//		ls.BreakDoWhileExample();
		ls.ForEachExample();
	}
	

}
