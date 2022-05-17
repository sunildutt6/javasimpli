package com.classdemo;

 class Bicycle {

	 public int gear;
	 public int speed;
	 
	 public Bicycle(int gear, int speed) {
		 this.gear = gear;
		 this.speed = speed;
	 }
	 
	 public void applyBrake(int decrement) {
		 speed-= decrement;
	 }
	 
	 public void speedUp(int increment) {
		 speed += increment;
	 }
	 
	 public String toString() {
		 return "No of gears are " + gear + "\n" + "speed of bicycle is " + speed ;
	 }
	 
	 
	public static void main(String[] args) {
		MountainBike mb = new MountainBike(5,100,25);
		System.out.println(mb.toString());
	}

}
