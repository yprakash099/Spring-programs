package com.sathya.springex;

public class Car implements Vehicle {
	private String fuelType;
	private int maxSpeed;
	@Override
	public void move() {
		System.out.println("Your selected car vehicle");
		System.out.println("FuelType..."+fuelType);
		System.out.println("maxSpeed..."+maxSpeed);
		
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	

}
