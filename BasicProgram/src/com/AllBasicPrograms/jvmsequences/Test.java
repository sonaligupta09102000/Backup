package com.AllBasicPrograms.jvmsequences;

public class Test {
	
	private int id;
	private String fname;
	private String lname;
	
	int a=10;
	
	static
	{
		
		System.out.println("hello this is 1 static block.....");
		
		System.out.println("hihkljk");
	}
	
	static
	{
		
		System.out.println("this is 2 static block....");
	}
	
	{
		//int c=90;
		System.out.println("Instance Initializer Block ");
	}
	
	public static void hello()
	{
		System.out.println("helllo");
	}
	
	public void bye()
	{
		System.out.println("Bye..");
	}
	public static void main(String[] args) {
		
		final int a=20;
		
		System.out.println("this is main method....");
		Test t1=new Test(34,"sonli","ioo");
		
		System.out.println(t1.hashCode());
		
		Test t2=new Test(30,"oiiii","oii");
		
		System.out.println(t2.hashCode());
		Test t=new Test();
	Test.hello();
		
	t.bye();
		
		{
			int c=8;
			System.out.println(c);
		}
//		t.setFname("sonali");
//		String fname2 = t.getFname();
//		System.out.println(fname2);
//		System.out.println(a);
//		System.out.println(a+1);
//		int b=a+1;
//		int b1=a;
//		System.out.println(b);
//		System.out.println(a+b);
//		System.out.println(b1);
//		
	}
	
	public Test()
	{
		super();
	}
	
	public Test(int id_no, String fullname, String user) {
		super();
		this.id = id_no;
		this.fname = fullname;
		this.lname = user;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int  getId()
	{
		return id;
	}

    public void setFname(String fname)
    {
    	this.fname=fname;
    }
    
    public String getFname()
    {
    	return fname;
    }
	
	public void setLname(String lname)
	{
		this.lname=lname;
	}
	
	public String getLname()
	{
		return lname;
	}
	static {
		System.out.println("the is static 1 static block after main method");
	}   
}
