package com.sathya.springex;

public class Pharmacy {
	private String name;
	private String location;
	public void pharmacyInfo()
	{
		System.out.println("Pharmacy name : "+name);
		System.out.println("Pharmacy Location : "+location);
	}
	public Pharmacy(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
}
