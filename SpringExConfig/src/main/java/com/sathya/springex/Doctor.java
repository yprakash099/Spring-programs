package com.sathya.springex;

public class Doctor {
	private int id;
	private String name;
	public void doctorInfo()
	{
		System.out.println("Doctor  Id : "+id);
		System.out.println("Doctor Name is "+name);
	}
	public Doctor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
}
