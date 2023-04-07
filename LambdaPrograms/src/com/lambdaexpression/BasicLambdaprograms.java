package com.lambdaexpression;

@FunctionalInterface
interface M1 {
	int getValue();
}

public class BasicLambdaprograms  extends Thread implements Runnable{

	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello");
			}
		}).start();

		BasicLambdaprograms nn = new BasicLambdaprograms();

		Thread t1 = new Thread(nn);
		t1.start();
		withLambdas();
	}

	@Override
	public void run() {
		System.out.println("call by t1");
	}

// With Lambda Expression

	public static void withLambdas() {

		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("call by runnable");
			}
		};
		new Thread(r1).start();
		
// use lambdas		
		Runnable r2 =()->{
			System.out.println("call by lambdas");
		};
		
	new Thread(r2).start();

// in thread
	
	BasicLambdaprograms nn = new BasicLambdaprograms();
	Thread t2  = new Thread(nn);
	
	t2.start();
	}
}
