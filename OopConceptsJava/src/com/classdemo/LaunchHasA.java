package com.classdemo;

class Heart{
	int beat;
	String blood_color;
	
	public Heart(int beat, String blood_color) {
		super();
		this.beat = beat;
		this.blood_color = blood_color;
	}

	public int getBeat() {
		return beat;
	}

	public String getBlood_color() {
		return blood_color;
	}	
}

class Mobile{
	int cost;
	String brand;
	public Mobile(int cost, String string) {
		super();
		this.cost = cost;
		this.brand = string;
	}
	public int getCost() {
		return cost;
	}
	public String getBrand() {
		return brand;
	}
	
}

class Sunil{
	Heart h = new Heart(73, "Red");
	void hasMobile(Mobile m) {
		System.out.println(m.getBrand());
		System.out.println(m.getCost());
	}
}

public class LaunchHasA {

	public static void main(String[] args) {

		Sunil s = new Sunil();
		Mobile mb = new Mobile(70, "apple");
		System.out.println(s.h.getBeat());
		System.out.println(s.h.getBlood_color());
		s.hasMobile(mb);
		
		
		//s = null;
		//System.out.println(s.h.getBeat());
		//System.out.println(s.h.getBlood_color());
		
		System.out.println(mb.getCost());
		System.out.println(mb.getBrand());
	}

}
