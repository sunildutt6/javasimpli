package com.classdemo;

public class PolyDemo {
	
	public int sum(int x, int y) {
		return x + y;
	}
	
	public int sum(int x, int y, int z) {
		return x + y + z;
	}
	
	public double sum(double x, double y) {
		return x + y ;
	}
	

	public static void main(String[] args) {

		PolyDemo p = new PolyDemo();
		System.out.println(p.sum(5,6));
		System.out.println(p.sum(5.5, 50.6660));
		System.out.println(p.sum(4, 60, 70));
	}

}
