                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       package com.cwh.inheritance;

class Circle {
	public int radius;
	
	Circle() {
		System.out.println("I am non param of circle ");
	}
	
	Circle(int r) {
		System.out.println("I am circle parameterized constructor");
	}
	
	public double area() {
		return Math.PI*this.radius*this.radius;
	}
}

class Cylinder extends Circle {
	
	public int height;
	
	Cylinder(int r, int h) {
		
		super(r);
		System.out.println("I am cylinder parameterized constructor");
	}
	
	public double volume() {
		return Math.PI*this.radius*this.radius*this.height;
	}
}



public class InheritCircleCylinder {

	public static void main(String[] args) {
		
		Cylinder obj = new Cylinder(12, 4);
		
	}

}
