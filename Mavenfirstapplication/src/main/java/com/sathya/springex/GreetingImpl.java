package com.sathya.springex;

public class GreetingImpl implements Greeting {

	@Override
	public void greet() {
		System.out.println("This is the first Spring Application");
		System.out.println("This is maven project.....");
	}
		
		public GreetingImpl()
		{
			System.out.println("GreetingImpl constructor :: object Created");
		}
	}

