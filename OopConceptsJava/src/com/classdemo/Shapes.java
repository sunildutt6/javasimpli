package com.classdemo;

import java.util.Scanner;

abstract class Shapes {
	double area;
	abstract void getData();
	abstract void calculate();
	void display() {
		System.out.println("The area is: " + area);
	}

}

class Circle extends Shapes{
	float r;
	float pi = 3.147f;
	
	@Override
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		r = sc.nextFloat();
	}
	
	@Override
	void calculate() {
		area = pi * r *r ;
	}
}

class Rectangle extends Shapes{
	float l, b;
	
	@Override
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		l = sc.nextFloat();
		
		System.out.println("Enter the breadth");
		b = sc.nextFloat();
		
	}
	@Override
	void calculate() {
		area  = l * b ;
		
	}
}