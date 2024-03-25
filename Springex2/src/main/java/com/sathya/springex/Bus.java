package com.sathya.springex;

public class Bus {
	private String busType;
	private int maxSpeed;
	public void move() {
		System.out.println("Your selected Bus vehicle");
		System.out.println("BusType..."+busType);
		System.out.println("maxSpeed..."+maxSpeed);
}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}