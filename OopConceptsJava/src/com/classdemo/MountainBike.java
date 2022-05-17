package com.classdemo;

public class MountainBike extends Bicycle {

	private int startHeight;

	public MountainBike(int gear, int speed, int startHeight) {
		super(gear, speed);
		this.startHeight = startHeight;
	}

	@Override
	public String toString() {
		return  super.toString() + "\nseat height is " + startHeight;
	}
	
	
	

}
